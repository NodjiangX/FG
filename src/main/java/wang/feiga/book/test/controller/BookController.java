package wang.feiga.book.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import wang.feiga.book.dto.AppointExecution;
import wang.feiga.book.dto.Result;
import wang.feiga.book.enums.AppointStateEnum;
import wang.feiga.book.exception.NoNumberException;
import wang.feiga.book.exception.RepeatAppointException;
import wang.feiga.book.test.entity.Book;
import wang.feiga.book.test.service.IBookService;

import java.util.List;

/**
 * 内容概要：BookController层
 * 作 者： 姜昊
 * 版本号： V1.0
 * 完成时间： 2018-02-01 11:09
 **/

@Controller
@RequestMapping("/book")
public class BookController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IBookService iBookService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private String list(Model model) {
        List<Book> books = iBookService.getList();
        model.addAttribute("list", books);
        return "list";
    }

    @RequestMapping(value = "/{bookId}/detail", method = RequestMethod.GET)
    private String detail(@PathVariable("bookId") long bookId, Model model) {
        if (bookId <= 0) {
            return "redirect:/book/list";
        }
        Book book = iBookService.queryById(bookId);
        if (book == null) {
            return "forward:/book/list";
        }
        model.addAttribute("book", book);
        return "detail";
    }

    /* ajax json */
    @RequestMapping(value = "/{bookId}/appoint", method = RequestMethod.POST, produces = {"application/json; charset=utf-8 "})
    @ResponseBody
    private Result<AppointExecution> appoint(@PathVariable("bookId") Long bookId, @RequestParam("studentId") Long studentId) {
        if (studentId == null || studentId.equals("")) {
            return new Result<AppointExecution>("学号不能为空", null);
        }
        AppointExecution execution = null;
        try {
            execution = iBookService.appoint(bookId, studentId);
        } catch (NoNumberException e1) {
            execution = new AppointExecution(bookId, AppointStateEnum.NO_NUMBER);
        } catch (RepeatAppointException e2) {
            execution = new AppointExecution(bookId, AppointStateEnum.REPEAT_APPOINT);
        } catch (Exception e) {
            execution = new AppointExecution(bookId, AppointStateEnum.INNER_ERROR);
        }
        return new Result<AppointExecution>(true, execution);
    }
}
