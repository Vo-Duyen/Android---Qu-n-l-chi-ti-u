package com.example.android___qu_n_l_chi_ti_u.Model;

public class Income {
    private int incomeID;
    private String incomeType;
    private double amount;
    private String dateReceived; // yyyy-MM-dd
    private String note;
    private String createdDate; // yyyy-MM-dd HH:mm:ss
    private String lastUpdated; // yyyy-MM-dd HH:mm:ss

    public Income() {}


    public Income(int incomeID, String incomeType, double amount, String dateReceived, String note, String createdDate, String lastUpdated) {
        this.incomeID = incomeID;
        this.incomeType = incomeType;
        this.amount = amount;
        this.dateReceived = dateReceived;
        this.note = note;
        this.createdDate = createdDate;
        this.lastUpdated = lastUpdated;
    }


    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(String dateReceived) {
        this.dateReceived = dateReceived;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(String incomeType) {
        this.incomeType = incomeType;
    }

    public int getIncomeID() {
        return incomeID;
    }

    public void setIncomeID(int incomeID) {
        this.incomeID = incomeID;
    }



}
