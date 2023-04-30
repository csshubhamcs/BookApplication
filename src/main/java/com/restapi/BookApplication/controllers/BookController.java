package com.restapi.BookApplication.controllers;

import com.restapi.BookApplication.entities.Book;
import com.restapi.BookApplication.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getBooks(){


        return bookService.getAllBooks();
    }
@GetMapping("/books/{id}")
    public Book getBookById(@PathVariable("id") int id){
        return bookService.getBookById(id);
}
}
