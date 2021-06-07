package com.henrietha.restApi.repository;

import com.henrietha.restApi.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}

