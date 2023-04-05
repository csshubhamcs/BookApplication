package com.restapi.BookApplication.controllers;

import com.restapi.BookApplication.entities.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @GetMapping("/books")
    public Book getBooks(){

        Book book = new Book();
        book.setId(123);
        book.setTitle("Complete java");
        book.setAuthor("Shubham singh");
        return book;
    }
}
