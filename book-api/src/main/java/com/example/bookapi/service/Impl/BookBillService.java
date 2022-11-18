package com.example.bookapi.service.Impl;

import com.example.bookapi.repository.IBookBillRepository;
import com.example.bookapi.service.IBookBillService;
import com.example.bookapi.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookBillService implements IBookBillService {
    @Autowired
    private IBookBillRepository bookBillRepository;
}
