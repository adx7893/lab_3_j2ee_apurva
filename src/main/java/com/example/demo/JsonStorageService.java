package com.example.demo;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class JsonStorageService {
    private static final String FILE_PATH = "src/main/resources/devices.json";
    private final ObjectMapper objectMapper = new ObjectMapper();

    public void saveDevices(List<Device> devices) throws IOException {
        objectMapper.writeValue(new File(FILE_PATH), devices);
    }

    public List<Device> loadDevices() throws IOException {
        return objectMapper.readValue(new File(FILE_PATH), objectMapper.getTypeFactory().constructCollectionType(List.class, Device.class));
    }
}

