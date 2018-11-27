package com.taverok.rcmderweb.repository;

import com.taverok.rcmderweb.domain.model.Book;
import com.taverok.rcmderweb.domain.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository {
    @Override
    public List<Book> findAll(User user) {
        return null;
    }
}
