package com.example.bookapi.service.Impl;

import com.example.bookapi.repository.ITypeBookRepository;
import com.example.bookapi.service.ITypeBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeBookService implements ITypeBookService {
    @Autowired
    private ITypeBookRepository typeBookRepository;
}
