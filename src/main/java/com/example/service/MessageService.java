package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.MessageRepository;
import com.example.entity.Message;

@Service
public class MessageService {
    @Autowired
    MessageRepository messageRepository;
}
