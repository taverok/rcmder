package com.taverok.rcmderweb.controller;

import com.taverok.rcmderweb.domain.model.Book;
import com.taverok.rcmderweb.domain.model.User;
import com.taverok.rcmderweb.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.taverok.rcmderweb.controller.BaseController.API_VERSION;

@RestController
@RequestMapping("/" + API_VERSION + "/book")
@RequiredArgsConstructor
public class BookController extends BaseController{
    private final BookService bookService;
    private User user = User.builder().id("1").build();

    @GetMapping
    public List<Book> getAll(@RequestParam Long userId){
        return bookService.getAll(user);
    }

    @PostMapping
    public Book addBook(@RequestBody Book book){
        bookService.addBook(book);
        bookService.attachToUser(book, user);
        return book;
    }
}
