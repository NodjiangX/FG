package wang.feiga.book.test.service;

import wang.feiga.book.dto.AppointExecution;
import wang.feiga.book.exception.RepeatAppointException;
import wang.feiga.book.test.entity.Book;

import java.util.List;

/**
 * 内容概要：BookService接口
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 * 作 者： 姜昊
 * 版本号： V1.0
 * 完成时间： 2018-01-31 16:26
 **/

public interface IBookService {
    /**
     * 查询一本图书
     *
     * @param id
     * @return
     */
    Book queryById(long id);

    /**
     * 查询所有图书
     *
     * @return
     */
    List<Book> getList();

    /**
     * 预约图书
     *
     * @param bookId
     * @param studentId
     * @return
     */
    AppointExecution appoint(long bookId, long studentId);
}
