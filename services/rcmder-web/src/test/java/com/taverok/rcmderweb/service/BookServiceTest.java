package com.taverok.rcmderweb.service;

import com.taverok.rcmderweb.domain.model.Book;
import com.taverok.rcmderweb.domain.model.User;
import com.taverok.rcmderweb.repository.BookRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

public class BookServiceTest {
    private BookService bookService;

    @Mock
    private BookRepository bookRepository;

    private List<Book> bookList;
    private User user = User.builder().build();

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        bookService = new BookServiceImpl(bookRepository);

        bookList = Arrays.asList(
                Book.builder().id("1111").ISBN("fdsfdsfdsf").build(),
                Book.builder().id("1111").ISBN("fdsfdsfdsf").build(),
                Book.builder().id("1111").ISBN("fdsfdsfdsf").build()
        );
    }

    @Test
    public void getAll() throws Exception {
        given(bookRepository.findAll(user)).willReturn(bookList);
        assertEquals(bookService.getAll(user).size(), 3);
    }

    @Test
    public void getRecommendations() throws Exception {
    }

}