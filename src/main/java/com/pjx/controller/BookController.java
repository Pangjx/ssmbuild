package com.pjx.controller;

import com.pjx.dao.BookMapper;
import com.pjx.pojo.Books;
import com.pjx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.selectAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddBook(Model model) {
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Books books) {
        System.out.println("addBook=>"+books);
        bookService.addBook(books);
        return "redirect:/book/allBook";//重定向到@  allBook请求
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(int id,Model model) {
        Books book = bookService.queryBookById(id);
        model.addAttribute("book",book);
        return "UpdateBook";
    }

    @RequestMapping("/UpdateBook")
    public String UpdateBook(Books books) {
        System.out.println("UpdateBookBook=>"+books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";//重定向到@  allBook请求
    }
}