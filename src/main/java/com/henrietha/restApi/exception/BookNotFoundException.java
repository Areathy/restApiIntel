package com.henrietha.restApi.exception;

import com.henrietha.restApi.entity.Book;

public class BookNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -2413998112178474615L;

//    public BookNotFoundException(Class<Book> book, Long id) {
//        super("Sorry the book with Id " + id.toString() + " not found");
//    }
//
//    public BookNotFoundException(Class<Book> book, String name) {
//        super("Sorry the book with name " + name + " not found");
//    }

    public BookNotFoundException(String message) {
        super(message);
    }

    public BookNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
