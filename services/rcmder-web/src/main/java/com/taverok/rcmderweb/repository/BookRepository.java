package com.taverok.rcmderweb.repository;

import com.taverok.rcmderweb.domain.model.Book;
import com.taverok.rcmderweb.domain.model.User;

import java.util.List;

public interface BookRepository {
    List<Book> findAll(User user);
}
