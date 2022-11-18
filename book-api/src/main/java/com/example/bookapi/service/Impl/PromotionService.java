package com.example.bookapi.service.Impl;

import com.example.bookapi.repository.IPromotionRepository;
import com.example.bookapi.service.IPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromotionService implements IPromotionService {
    @Autowired
    private IPromotionRepository promotionRepository;
}
