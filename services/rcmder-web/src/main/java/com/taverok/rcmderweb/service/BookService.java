package com.taverok.rcmderweb.service;

import com.taverok.rcmderweb.domain.model.Book;
import com.taverok.rcmderweb.domain.model.User;

import java.util.List;

public interface BookService {
    List<Book> getAll(User user);
    void addBook(Book book);
    void attachToUser(Book book, User user);
    List<Book> getRecommendations(Book book);
}
