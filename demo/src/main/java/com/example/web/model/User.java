package com.example.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {
    
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "login_id")
    private String loginId;

    @Column(name = "teacher_id")
    private String teacherId;

    @Column(name = "name")
    private String name;

        
    @Column(name = "department")
    private Integer department;

    @Column(name = "authority")
    private Integer authority;

    @Column(name = "enable")
    private Integer enable;

    @Column(name = "password")
    private String password;
}
