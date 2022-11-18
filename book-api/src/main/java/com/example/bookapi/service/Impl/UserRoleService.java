package com.example.bookapi.service.Impl;

import com.example.bookapi.repository.IUserRoleRepository;
import com.example.bookapi.service.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleService implements IUserRoleService {
    @Autowired
    private IUserRoleRepository userRoleRepository;
}
