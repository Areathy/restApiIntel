package com.henrietha.restApi.service;

import com.henrietha.restApi.entity.Book;

import java.util.List;

public interface BookService {
    Book createBook(Book book);

    Book updateBook(Book book);

    List<Book> getAllBook();

    Book getBookById(long bookId);

    void deleteBook(long id);
}
