package wang.feiga.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import wang.feiga.baseTest.SpringTestCase;
import wang.feiga.book.dto.AppointExecution;
import wang.feiga.book.test.service.IBookService;

/**
 * 内容概要：BookServiceImpl接口测试
 * 作 者： 姜昊
 * 版本号： V1.0
 * 完成时间： 2018-02-01 10:41
 **/

public class BookServiceImplTest extends SpringTestCase{

    @Autowired
    private IBookService iBookService;

    @Test
    public void testAppoint() throws Exception{
        long bookId=1000;
        long studentId=12345678L;
        AppointExecution execution =iBookService.appoint(bookId,studentId);
        System.out.println(execution);
    }
}
