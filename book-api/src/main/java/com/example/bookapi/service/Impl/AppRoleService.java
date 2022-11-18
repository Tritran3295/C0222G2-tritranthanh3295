package com.example.bookapi.service.Impl;

import com.example.bookapi.repository.IAppRoleRepository;
import com.example.bookapi.service.IAppRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppRoleService implements IAppRoleService {
    @Autowired
    private IAppRoleRepository appRoleRepository;
}
