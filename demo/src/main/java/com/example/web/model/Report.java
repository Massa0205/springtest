package com.example.web.model;

import java.time.LocalDateTime;

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

}
