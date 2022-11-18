package com.example.bookapi.service.Impl;

import com.example.bookapi.repository.INotificationRepository;
import com.example.bookapi.service.INotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class NotificationService implements INotificationService {
    @Autowired
    private INotificationRepository notificationRepository;

    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder(12).encode("123"));
    }
}
