package com.example.web.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.JoinColumn;

public class Report {
    /**
     * @TODO one to many many to one 
     */
    private int id;
    private String userId;
    private int companyCode;
    private int type;
    private String impression;
    private LocalDateTime postDate;

    public int getId() { return this.id; }
    public String getUserId() { return this.userId; }
    public int getCompanyCode() { return this.companyCode; }
    public int getType() { return this.type; }
    public String getImpression() { return this.impression; }
    public LocalDateTime getPostDate() { return this.postDate; }

    public void setId(int id) { this.id = id; }
    public void setUserId(String userId) { this.userId = userId; }
    public void setCompanyCode(int companyCode) { this.companyCode = companyCode; }
    public void setType(int type) { this.type = type; }
    public void setImpression(String impression) { this.impression = impression; }
    public void setPostDate(LocalDateTime postDate) { this.postDate = postDate; } 
}
