package com.techgainers.springboothibernate.controller;


import com.techgainers.springboothibernate.model.Book;
import com.techgainers.springboothibernate.repository.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    public static Logger logger = LoggerFactory.getLogger(BookService.class);

    @Autowired
    BookService bookService;

    @GetMapping("/books")
    public List<Book> allBooksGet(){

        logger.info("Inside controller class.");
    List<Book> bookList = bookService.list();

    return bookList;
    }
}
