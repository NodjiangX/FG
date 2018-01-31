package wang.feiga.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import wang.feiga.baseTest.SpringTestCase;
import wang.feiga.book.test.dao.BookDao;
import wang.feiga.book.test.entity.Book;

import java.util.List;

/**
 * 内容概要：bookDao的接口测试
 * 作 者： 姜昊
 * 版本号： V1.0
 * 完成时间： 2018-01-31 13:22
 **/
public class BookDaoTest extends SpringTestCase {
    @Autowired
    private BookDao bookDao;

    @Test
    /*测试成功*/
    public void testqueryById() {
        long bookId = 1000;
        Book book = bookDao.queryById(bookId);
        System.out.println("图书是:" + book);
    }

    @Test
    /*测试成功*/
    public void testqueryAll() {
        int offset = 1;
        int limit = 3;
        List<Book> booklist = bookDao.queryAll(offset, limit);
        System.out.println("图书列表：" + booklist);
    }

    @Test
    public void testreduceNumber(){
        long bookId=1000;
        int booknum=bookDao.reduceNumber(bookId);
        System.out.println("减少数量:"+booknum);
    }
}
