package com.devmountain.noteApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devmountain.noteApp.repositories.UserRepository;

@Service
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;
    
}
