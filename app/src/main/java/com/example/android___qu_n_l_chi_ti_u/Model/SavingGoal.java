package com.example.android___qu_n_l_chi_ti_u.Model;

public class SavingGoal {
    private int goalID;
    private String goalName;
    private double targetAmount;
    private double savedAmount;
    private String deadline; // yyyy-MM-dd
    private String createdDate; // yyyy-MM-dd HH:mm:ss
    private String lastUpdated; // yyyy-MM-dd HH:mm:ss

    public SavingGoal() {}


    public SavingGoal(int goalID, String goalName, double targetAmount, double savedAmount, String deadline, String createdDate, String lastUpdated) {
        this.goalID = goalID;
        this.goalName = goalName;
        this.targetAmount = targetAmount;
        this.savedAmount = savedAmount;
        this.deadline = deadline;
        this.createdDate = createdDate;
        this.lastUpdated = lastUpdated;
    }

    public double getSavedAmount() {
        return savedAmount;
    }

    public void setSavedAmount(double savedAmount) {
        this.savedAmount = savedAmount;
    }

    public int getGoalID() {
        return goalID;
    }

    public void setGoalID(int goalID) {
        this.goalID = goalID;
    }

    public String getGoalName() {
        return goalName;
    }

    public void setGoalName(String goalName) {
        this.goalName = goalName;
    }

    public double getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(double targetAmount) {
        this.targetAmount = targetAmount;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
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
