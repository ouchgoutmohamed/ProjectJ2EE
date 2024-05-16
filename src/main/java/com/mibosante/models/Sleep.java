package com.mibosante.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Sleep {
    private int id;
    private LocalDate date;
    private LocalTime bedTime;
    private LocalTime wakeTime;

    public Sleep(LocalDate date, LocalTime bedTime, LocalTime wakeTime) {
        this.date = date;
        this.bedTime = bedTime;
        this.wakeTime = wakeTime;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getBedTime() {
        return bedTime;
    }

    public void setBedTime(LocalTime bedTime) {
        this.bedTime = bedTime;
    }

    public LocalTime getWakeTime() {
        return wakeTime;
    }

    public void setWakeTime(LocalTime wakeTime) {
        this.wakeTime = wakeTime;
    }

    public void setId(int id) {
        this.id = id;
    }
// getters and setters
}