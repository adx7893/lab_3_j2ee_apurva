package com.example.demo;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

public class User {
    private String username;
    private String password;
    private Device preferredDevice;

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Device getPreferredDevice() {
        return preferredDevice;
    }

    public void setPreferredDevice(Device preferredDevice) {
        this.preferredDevice = preferredDevice;
    }
}
