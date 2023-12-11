package com.demo.bookshop.service;

import com.demo.bookshop.entity.Book;

import java.util.List;

public interface BookService {
    void save(Book book);
    List<Book> findAll();
    Book findById(Long id);
}
