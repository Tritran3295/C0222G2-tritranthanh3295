package com.example.bookapi.controller;

import com.example.bookapi.model.AppRole;
import com.example.bookapi.model.AppUser;
import com.example.bookapi.model.UserRole;
import com.example.bookapi.service.IAppRoleService;
import com.example.bookapi.service.IAppUserService;
import com.example.bookapi.service.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RequestMapping("/api/public")
public class AppUserController {
    @Autowired
    private IAppUserService appUserService;

    @Autowired
    private IUserRoleService userRoleService;

    @Autowired
    private IAppRoleService appRoleService;
}
