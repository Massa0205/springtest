package com.example.web.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.web.model.Report;

public interface ReportRepository extends JpaRepository<Report, Integer>{
    
}
