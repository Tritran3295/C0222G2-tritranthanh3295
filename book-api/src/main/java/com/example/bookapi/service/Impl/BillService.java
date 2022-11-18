package com.example.bookapi.service.Impl;

import com.example.bookapi.repository.IBillRepository;
import com.example.bookapi.service.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillService implements IBillService {
    @Autowired
    private IBillRepository billRepository;
}
