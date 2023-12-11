package com.demo.bookshop.controller;

import com.demo.bookshop.entity.Author;
import com.demo.bookshop.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping("/author/add")
    public String  showFrom(Model model) {
        Author author = new Author();
        model.addAttribute("newAuthor", author);
        return "authors/addAuthor";
    }

    @PostMapping("/author/create")
    public String getAuthor(Author author, Model model) {
        authorService.save(author);
        model.addAttribute("newAuthor",author);
        return "authors/addAuthor";
    }
}
