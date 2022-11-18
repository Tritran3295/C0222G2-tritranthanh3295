package com.example.bookapi.service;

import com.example.bookapi.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBookService {

    Page<Book> getAllBook(Pageable pageable);
}
