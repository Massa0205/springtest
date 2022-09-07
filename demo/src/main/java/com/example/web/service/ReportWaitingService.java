package com.example.web.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.web.repository.ReportWaitingRepository;

public class ReportWaitingService {
    @Autowired
    ReportWaitingRepository repository;
}
