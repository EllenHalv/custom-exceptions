package org.example.controller;

import org.example.service.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureController {

    @Autowired
    TemperatureService service;

    @PostMapping("/set-temp")
    public String setTemperature(@RequestBody int temperature) {
        return service.setTemperature(temperature);
    }
}
