package com.example.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.web.repository.ReportRepository;

import com.example.web.model.Report;

public class ReportService {
    @Autowired
    ReportRepository repository;

    public List<Report> getAllReports() { return repository.findAll(); }
}
