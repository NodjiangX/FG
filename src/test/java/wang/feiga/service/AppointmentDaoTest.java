package wang.feiga.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import wang.feiga.baseTest.SpringTestCase;
import wang.feiga.book.test.dao.AppointmentDao;
import wang.feiga.book.test.entity.Appointment;

/**
 * 内容概要：AppointmentDao接口测试
 * 作 者： 姜昊
 * 版本号： V1.0
 * 完成时间： 2018-01-31 14:01
 **/
public class AppointmentDaoTest extends SpringTestCase {

    @Autowired
    private AppointmentDao appointmentDao;

    @Test
    /*测试成功*/
    public void testinsertAppiontment() {
        long bookId = 1000;
        long studentId = 1;
        int line = appointmentDao.insertAppiontment(bookId, studentId);
        System.out.println("插入条数：" + line);
    }

    @Test
    /*测试成功*/
    public void testqueryByKeyWithBook() {
        long bookId = 1000;
        long studentId = 1;
        Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
        System.out.println("预约图书记录：" + appointment);
    }
}
