package com.example.demo;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @After("execution(* com.smarthome.services.DeviceService.toggleDeviceStatus(..))")
    public void logDeviceStatusChange() {
        System.out.println("Device status changed.");
    }
}
