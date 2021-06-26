package com.henrietha.restApi.controller;

import com.henrietha.restApi.dto.BookDTO;
import com.henrietha.restApi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public ResponseEntity<List<BookDTO>> getAllBook(){
        return ResponseEntity.ok().body(bookService.getAllBook());
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<BookDTO> getBookById(@PathVariable long id){
        return ResponseEntity.ok().body(bookService.getBookById(id));
    }

    @PostMapping("/books")
    public ResponseEntity<BookDTO> createBook(@RequestBody BookDTO book){
        return ResponseEntity.ok().body(this.bookService.createBook(book));
    }

    @PutMapping("/books/{id}")
    public ResponseEntity<BookDTO> updateBook(@PathVariable long id, @RequestBody BookDTO book){
        book.setId(id);
        return ResponseEntity.ok().body(this.bookService.updateBook(book));
    }

    @DeleteMapping("/books/{id}")
    public HttpStatus deleteBook(@PathVariable long id){
//    public ResponseEntity<?> deleteBook(@PathVariable long id){
        this.bookService.deleteBook(id);
        return HttpStatus.OK;
//        return (ResponseEntity<?>) ResponseEntity.status((HttpStatus.OK));
    }
}
