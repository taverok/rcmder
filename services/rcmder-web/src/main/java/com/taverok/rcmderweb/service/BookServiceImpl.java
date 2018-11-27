package com.taverok.rcmderweb.service;

import com.taverok.rcmderweb.domain.model.Book;
import com.taverok.rcmderweb.domain.model.User;
import com.taverok.rcmderweb.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public List<Book> getAll(User user) {
        return bookRepository.findAll(user);
    }

    @Override
    public List<Book> getRecommendations(Book book) {
        return null;
    }
}
