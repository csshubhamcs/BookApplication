package com.restapi.BookApplication.services;

import com.restapi.BookApplication.entities.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    private static List<Book> list = new ArrayList<>();

    static {
        list.add(new Book(1,"java1 complete book ","Shubham Singh1"));
        list.add(new Book(2,"java2 complete book ","Shubham Singh2"));
        list.add(new Book(3,"java3 complete book ","Shubham Singh3"));
    }


    public List<Book> getAllBooks(){

        return list;
    }

    public Book getBookById(int id){
        return list.stream().filter(b -> b.getId() == id).findFirst().get();
    }
}
