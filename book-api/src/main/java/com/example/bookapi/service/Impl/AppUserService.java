package com.example.bookapi.service.Impl;

import com.example.bookapi.repository.IAppUserRepository;
import com.example.bookapi.service.IAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService implements IAppUserService {
    @Autowired
    private IAppUserRepository userRepository;


}
