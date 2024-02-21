package com.demo.bookshop.controller;

import com.demo.bookshop.entity.Book;
import com.demo.bookshop.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/add/book")
    public String showForm(Model model) {
        Book book = new Book();
        model.addAttribute("newBook", book);
        return "books/addBook";
    }

    @PostMapping("/add/book")
    public String getBook(Book book, Model model) {

        bookService.save(book);
        model.addAttribute("newBook", book);
        return "books/addBook";

    }

}