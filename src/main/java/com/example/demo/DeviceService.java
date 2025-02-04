package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class DeviceService {
    public void turnOn(Device device) {
        device.setStatus("ON");
        // additional logic
    }

    public void turnOff(Device device) {
        device.setStatus("OFF");
        // additional logic
    }
}
