package com.example.web.model;

public class Company {
    private int id; 
    private String name;
    private String address;
    private String hpUrl;
    /**
     * @TODO one to many many to one
     */

    public int getId() { return this.id; }
    public String getName() { return this.name; }
    public String getAddress() { return this.address; }
    public String getHpUrl() { return this.hpUrl; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAddress(String address) { this.address = address; }
    public void setHpUrl(String hpUrl) { this.hpUrl = hpUrl; } 
    
}
