package com.techgainers.springboothibernate.repository;

import com.techgainers.springboothibernate.model.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService{

    public static Logger logger = LoggerFactory.getLogger(BookService.class);

    @Autowired
    BookRepository bookRepository;

    public List<Book> list(){

        logger.info("Inside service class");
        return bookRepository.findAll();
    }

}
