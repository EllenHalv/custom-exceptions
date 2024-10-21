package org.example.exception;

// Extend the closest appropriate class
public class InvalidTemperatureException extends IllegalArgumentException {
    public InvalidTemperatureException(String message) {
        super(message);
    }
}
