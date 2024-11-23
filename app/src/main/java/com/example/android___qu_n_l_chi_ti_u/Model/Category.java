package com.example.android___qu_n_l_chi_ti_u.Model;

public class Category {


    private int categoryID;
    private String categoryName;
    private Double monthlyLimit; // Nullable
    private String createdDate; // yyyy-MM-dd HH:mm:ss
    private String lastUpdated; // yyyy-MM-dd HH:mm:ss

    public Category() {
    }

    public Category(int categoryID, String categoryName, Double monthlyLimit, String createdDate, String lastUpdated) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.monthlyLimit = monthlyLimit;
        this.createdDate = createdDate;
        this.lastUpdated = lastUpdated;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Double getMonthlyLimit() {
        return monthlyLimit;
    }

    public void setMonthlyLimit(Double monthlyLimit) {
        this.monthlyLimit = monthlyLimit;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}
