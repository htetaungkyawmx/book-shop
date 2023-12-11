package com.demo.bookshop.service.impl;

import com.demo.bookshop.entity.Author;
import com.demo.bookshop.repo.AuthorRepo;
import com.demo.bookshop.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepo authorRepo;

    @Override
    public void save(Author author) {
        authorRepo.save(author);
    }

    @Override
    public List<Author> findAll() {
        return authorRepo.findAll();
    }
}
