package com.nk.model;

import java.io.Serializable;

public class Student implements Serializable {
    private String userId;
    private String userName;
    private double money;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Student_info{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", money=" + money +
                '}';
    }
}
