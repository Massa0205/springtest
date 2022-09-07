package com.example.web.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.web.repository.ReportRepository;

public class ReportService {
    @Autowired
    ReportRepository repository;
}
