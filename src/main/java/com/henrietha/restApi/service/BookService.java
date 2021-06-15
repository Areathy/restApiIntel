package com.henrietha.restApi.service;

import com.henrietha.restApi.dto.BookDTO;
import com.henrietha.restApi.entity.Book;

import java.util.List;

public interface BookService {
    BookDTO createBook(BookDTO book);

    BookDTO updateBook(BookDTO book);

    List<BookDTO> getAllBook();

    BookDTO getBookById(long bookId);

    void deleteBook(long id);
}
