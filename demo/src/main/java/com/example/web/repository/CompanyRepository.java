package com.example.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.web.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{
}
