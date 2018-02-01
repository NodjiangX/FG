package wang.feiga.book.test.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wang.feiga.book.dto.AppointExecution;
import wang.feiga.book.enums.AppointStateEnum;
import wang.feiga.book.exception.AppointException;
import wang.feiga.book.exception.NoNumberException;
import wang.feiga.book.exception.RepeatAppointException;
import wang.feiga.book.test.dao.AppointmentDao;
import wang.feiga.book.test.dao.BookDao;
import wang.feiga.book.test.entity.Appointment;
import wang.feiga.book.test.entity.Book;
import wang.feiga.book.test.service.IBookService;

import java.util.List;


/**
 * 内容概要：图书service实现类
 * 作 者： 姜昊
 * 版本号： V1.0
 * 完成时间： 2018-02-01 9:37
 **/

@Service
public class BookServiceImpl implements IBookService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BookDao bookDao;
    @Autowired
    private AppointmentDao appointmentDao;

    public Book queryById(long id) {
        return bookDao.queryById(id);
    }

    public List<Book> getList() {
        return bookDao.queryAll(0, 1000);
    }

    /**
     * 使用注解控制事务方法的优点：
     * 1.开发团队达成一致约定，明确标注事务方法的编程风格
     * 2.保证事务方法的执行时间尽可能短，不要穿插其他网络操作，RPC/HTTP请求或者剥离到事务方法外部
     * 3.不是所有的方法都需要事务，如只有一条修改操作，只读操作不需要事务控制
     */
    @Transactional
    public AppointExecution appoint(long bookId, long studentId) {

        try {
            //减库存
            int update = bookDao.reduceNumber(bookId);
            //库存不足
            if (update <= 0) throw new NoNumberException("no number");
            else {
                int insert = appointmentDao.insertAppiontment(bookId, studentId);
                //预约成功
                if (insert <= 0) { //重复预约
                    throw new RepeatAppointException("repeat Appoint");
                } else {
                    Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
                    return new AppointExecution(bookId, AppointStateEnum.SUCCESS, appointment);
                }
            }
            // 要先于catch Exception异常前先catch住再抛出，
            // 不然自定义的异常也会被转换为AppointException，导致控制层无法具体识别是哪个异常
        } catch (NoNumberException n) {
            throw n;
        } catch (RepeatAppointException n2) {
            throw n2;
        } catch (Exception n3) {
            logger.error(n3.getMessage(), n3);
            throw new AppointException("appoint inner error:" + n3.getMessage());
        }
    }
}
