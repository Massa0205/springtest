package com.example.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.web.repository.ReportTypeRepository;

import com.example.web.model.ReportType;

public class ReportTypeService {
    @Autowired
    ReportTypeRepository repository;

    public List<ReportType> getAllType(){ return repository.findAll(); }
}
