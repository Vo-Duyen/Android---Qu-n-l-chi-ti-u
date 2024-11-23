package com.example.android___qu_n_l_chi_ti_u.Model;

import java.security.PublicKey;

public class User {

    public int UserId ;
    public  String UserName ;
    public String createdDate ;
    public  String lastUpdated ;

    public User() {
    }

    public User(String userName, String createdDate, String lastUpdated) {
        UserName = userName;
        this.createdDate = createdDate;
        this.lastUpdated = lastUpdated;
    }

    public int getUserId() {
        return UserId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
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

    @Override
    public String toString() {
        return "User{" +
                "UserId='" + UserId + '\'' +
                ", UserName='" + UserName + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                '}';
    }


}
