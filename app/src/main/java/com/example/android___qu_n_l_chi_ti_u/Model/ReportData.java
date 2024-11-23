package com.example.android___qu_n_l_chi_ti_u.Model;

public class ReportData {
    private int reportID;
    private String reportType; // "Ngày", "Tuần", "Tháng", "Năm"
    private String startDate; // yyyy-MM-dd
    private String endDate; // yyyy-MM-dd
    private double totalIncome;
    private double totalExpense;
    private String createdDate; // yyyy-MM-dd HH:mm:ss

    public ReportData() {}

    public ReportData(int reportID, String reportType, String startDate, String endDate, double totalIncome, double totalExpense, String createdDate) {
        this.reportID = reportID;
        this.reportType = reportType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalIncome = totalIncome;
        this.totalExpense = totalExpense;
        this.createdDate = createdDate;
    }


    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public int getReportID() {
        return reportID;
    }

    public void setReportID(int reportID) {
        this.reportID = reportID;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }


}
