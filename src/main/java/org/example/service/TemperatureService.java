package org.example.service;

import org.example.exception.InvalidTemperatureException;
import org.springframework.stereotype.Service;

@Service
public class TemperatureService {

    public String setTemperature(int temperature) {
        if (temperature < 5 || temperature > 35) {
            throw new InvalidTemperatureException("Invalid temperature: " + temperature);
        }
        return "Temperature set to " + temperature;
    }
}
