package com.taverok.rcmder.repository;

import com.taverok.rcmder.domain.model.Book;
import com.taverok.rcmder.domain.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository {
    @Override
    public List<Book> findAllByUser(User user) {
        return null;
    }
}
