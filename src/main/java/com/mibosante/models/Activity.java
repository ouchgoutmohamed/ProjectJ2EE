package com.mibosante.models;

import java.sql.Date;

public class Activity {
    private int id;
    private String activityType;
    private Date date;
    private String description;

    public Activity(int id, String activityType, Date date, String description) {
        this.id = id;
        this.activityType = activityType;
        this.date = date;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}