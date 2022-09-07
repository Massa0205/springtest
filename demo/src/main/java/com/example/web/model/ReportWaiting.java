package com.example.web.model;

import java.time.LocalDateTime;

public class report_waiting {
    private int id;
    private String poster;
    private int companyId;
    private int type;
    private String impression;
    private LocalDateTime reportDate;
    private int status;

    public int getId() { return this.id; }
    public String getPoster() { return this.poster; }
    public int getCompanyId() { return this.companyId; }
    public int getType() { return this.type; }
    public String getImpression() { return this.impression; }
    public LocalDateTime getReportDate() { return this.reportDate; }
    public int getStatus() { return this.status; }

    public void setId(int id) { this.id = id; }
    public void setPoster(String poster) { this.poster = poster; }
    public void setCompanyId(int companyId) { this.companyId = companyId; }
    public void setType(int type) { this.type = type; }
    public void setImpression(String impression) { this.impression = impression; }
    public void setReportDate(LocalDateTime reportDate) { this.reportDate = reportDate; }
    public void setStatus(int status) { this.status = status; }
}
