package com.taverok.rcmderweb.controller;

import com.taverok.rcmderweb.domain.model.Book;
import com.taverok.rcmderweb.domain.model.User;
import com.taverok.rcmderweb.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static com.taverok.rcmderweb.controller.BaseController.API_VERSION;

@RequestMapping(API_VERSION + "/book")
@RequiredArgsConstructor
public class BookController extends BaseController{
    private final BookService bookService;

    @GetMapping("/")
    public List<Book> getAll(@PathVariable Long userId){
        User user = User.builder().id(userId.toString()).build();

        return bookService.getAll(user);
    }
}
