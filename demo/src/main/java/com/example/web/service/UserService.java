package com.example.web.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.web.repository.UserRepository;

public class UserService {
    @Autowired
    UserRepository repository;
    
}
