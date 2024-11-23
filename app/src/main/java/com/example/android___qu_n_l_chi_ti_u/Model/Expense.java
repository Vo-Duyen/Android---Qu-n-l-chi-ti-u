package com.example.android___qu_n_l_chi_ti_u.Model;

public class Expense {
    private int expenseID;
    private int categoryID;
    private double amount;
    private String dateSpent; // yyyy-MM-dd
    private String receiptImage;
    private String note;
    private String createdDate; // yyyy-MM-dd HH:mm:ss
    private String lastUpdated; // yyyy-MM-dd HH:mm:ss

    public Expense() {}

    public Expense(int expenseID, int categoryID, double amount, String dateSpent, String receiptImage, String note, String createdDate, String lastUpdated) {
        this.expenseID = expenseID;
        this.categoryID = categoryID;
        this.amount = amount;
        this.dateSpent = dateSpent;
        this.receiptImage = receiptImage;
        this.note = note;
        this.createdDate = createdDate;
        this.lastUpdated = lastUpdated;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getExpenseID() {
        return expenseID;
    }

    public void setExpenseID(int expenseID) {
        this.expenseID = expenseID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getDateSpent() {
        return dateSpent;
    }

    public void setDateSpent(String dateSpent) {
        this.dateSpent = dateSpent;
    }

    public String getReceiptImage() {
        return receiptImage;
    }

    public void setReceiptImage(String receiptImage) {
        this.receiptImage = receiptImage;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
