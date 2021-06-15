package com.henrietha.restApi.service;

import com.henrietha.restApi.dto.BookDTO;
import com.henrietha.restApi.entity.Book;
import com.henrietha.restApi.exception.BookNotFoundException;
import com.henrietha.restApi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BookServiceImpl implements BookService{
    @Autowired
    private BookRepository bookRepository;

    @Override
    public BookDTO createBook(BookDTO request) {
        Book book = new Book();
        book.setCreateDate(request.getCreateDate());
        book.setDescription(request.getDescription());
        book.setTitle(request.getTitle());
        book.setPrice(request.getPrice());
        book.setUpdateDate(request.getUpdateDate());
        Book save = bookRepository.save(book);
        request.setId(save.getId());
        return request;
    }

    @Override
    public BookDTO updateBook(BookDTO book) {
        Optional<Book> bookDb = this.bookRepository.findById(book.getId());

        if(bookDb.isPresent()) {
            Book bookUpdate = bookDb.get();
            bookUpdate.setId(book.getId());
            bookUpdate.setTitle(book.getTitle());
            bookUpdate.setDescription(book.getDescription());
            bookRepository.save(bookUpdate);
            return book;
        }else {
            throw new BookNotFoundException("Record not found with id : " + book.getId());
        }
    }

    @Override
    public List<BookDTO> getAllBook() {
        List<BookDTO> resp = new ArrayList<>();
        this.bookRepository.findAll().forEach(a->{
            BookDTO obj = new BookDTO();
            obj.setId(a.getId());
            obj.setCreateDate(a.getCreateDate());
            obj.setDescription(a.getDescription());
            obj.setTitle(a.getTitle());
            obj.setPrice(a.getPrice());
            obj.setUpdateDate(a.getUpdateDate());
            resp.add(obj);
        });
        return resp;
    }

    @Override
    public BookDTO getBookById(long bookId) {
        Optional<Book> bookDb = this.bookRepository.findById(bookId);

        if(bookDb.isPresent()) {
            Book book = bookDb.get();
            BookDTO obj = new BookDTO();
            obj.setId(book.getId());
            obj.setCreateDate(book.getCreateDate());
            obj.setDescription(book.getDescription());
            obj.setTitle(book.getTitle());
            obj.setPrice(book.getPrice());
            obj.setUpdateDate(book.getUpdateDate());
            return obj;
        }else {
            throw new BookNotFoundException("Record not found with id : " + bookId);
        }
    }

    @Override
    public void deleteBook(long bookId) {
        Optional<Book> bookDb = this.bookRepository.findById(bookId);

        if(bookDb.isPresent()) {
            this.bookRepository.delete(bookDb.get());
        }else {
            throw new BookNotFoundException("Record not found with id : " + bookId);
        }
    }
}
