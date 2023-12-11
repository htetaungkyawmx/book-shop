package com.demo.bookshop.repo;

import com.demo.bookshop.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends JpaRepository <Author,Long> {

}
