package com.taverok.rcmder.repository;

import com.taverok.rcmder.domain.model.Book;
import com.taverok.rcmder.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, String> {
    List<Book> findAllByUsers(User user);
}
