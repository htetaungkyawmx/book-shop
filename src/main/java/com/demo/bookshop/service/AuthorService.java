package com.demo.bookshop.service;

import com.demo.bookshop.entity.Author;

import java.util.List;

public interface AuthorService {
    void save(Author author);
    List<Author> findAll();

}
