package com.example.web.repository;

import org.springframework.stereotype.Repository;

import com.example.web.model.ReportType;

import org.springframework.data.jpa.repository.JpaRepository;



@Repository
public interface ReportTypeRepository extends JpaRepository<ReportType, Integer>{
    
}
