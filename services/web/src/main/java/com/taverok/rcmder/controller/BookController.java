package com.taverok.rcmder.controller;

import com.taverok.rcmder.domain.model.Book;
import com.taverok.rcmder.domain.model.User;
import com.taverok.rcmder.repository.UserRepository;
import com.taverok.rcmder.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.taverok.rcmder.controller.BaseController.API_VERSION;

@RestController
@RequestMapping("/" + API_VERSION + "/book")
@RequiredArgsConstructor
public class BookController extends BaseController{
    private final BookService bookService;
    private final UserRepository userRepository;
    private User user = User.builder().id("1").build();

    @GetMapping
    public List<Book> get(@RequestParam Long userId){
        return bookService.getAll(user);
    }

    @PostMapping
    public Book add(@RequestBody Book book, @RequestParam Long userId){
        bookService.addBook(book);
        bookService.attachToUser(book, user);
        return book;
    }
}
