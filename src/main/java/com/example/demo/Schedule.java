package com.example.demo;

import lombok.Data;
import java.time.LocalDateTime;

import java.time.LocalDateTime;

public class Schedule {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Device device;

    // Getters and Setters
    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}
