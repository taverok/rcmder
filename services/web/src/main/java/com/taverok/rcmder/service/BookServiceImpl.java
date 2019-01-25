package com.taverok.rcmder.service;

import com.taverok.rcmder.domain.model.Book;
import com.taverok.rcmder.domain.model.User;
import com.taverok.rcmder.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    private final HashMap<User, List<Book>> books = new HashMap<>();

    @Override
    public List<Book> getAll(User user) {
        return books.get(user);
    }

    @Override
    public List<Book> getRecommendations(Book book) {
        return null;
    }

    @Override
    public void addBook(Book book) {

    }

    @Override
    public void attachToUser(Book book, User user) {
        List<Book> userBooks = this.books.get(user);
        if (userBooks == null)
            userBooks = new ArrayList<>();
            this.books.put(user, userBooks);

        userBooks.add(book);
    }
}
