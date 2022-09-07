package com.example.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportWaitingRepository extends JpaRepository<ReportWaitingRepository, Integer>{
    
}
