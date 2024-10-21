package org.example;

import org.example.exception.InvalidTemperatureException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Thermostat is running...");
        while (true) {
            try {
                setThermostat();
            } catch (InvalidTemperatureException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void setThermostat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        int temperature = scanner.nextInt();
        if (temperature < 5 || temperature > 35) {
            throw new InvalidTemperatureException("Invalid temperature: " + temperature);
        }
        System.out.println("Temperature set to " + temperature);
    }
}

