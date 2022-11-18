package com.example.bookapi.service.Impl;

import com.example.bookapi.repository.IBillDetailRepository;
import com.example.bookapi.service.IBillDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillDetailService implements IBillDetailService {
    @Autowired
    private IBillDetailRepository billDetailRepository;
}
