package com.example.bookapi.controller;

import com.example.bookapi.model.Book;
import com.example.bookapi.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/employee")
public class BookRestController {
    @Autowired
    private IBookService bookService;

    @GetMapping("/list-book")
    public ResponseEntity<Page<Book>> findAllBook(@PageableDefault(5)Pageable pageable){
        Page<Book> bookPage = this.bookService.getAllBook(pageable);
        if (bookPage.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(bookPage,HttpStatus.OK);
        }
    }
}
