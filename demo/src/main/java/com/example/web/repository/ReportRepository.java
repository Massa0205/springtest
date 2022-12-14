package com.example.web.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.web.model.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report, Integer>{
    
}
