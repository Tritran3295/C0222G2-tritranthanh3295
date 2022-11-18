package com.example.bookapi.service.Impl;

import com.example.bookapi.model.Book;
import com.example.bookapi.repository.IBookRepository;
import com.example.bookapi.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private IBookRepository bookRepository;

    @Override
    public Page<Book> getAllBook(Pageable pageable) {
        return bookRepository.getAllBook(pageable);
    }
}
