package org.example.exception;

public class InvalidTemperatureException extends RuntimeException {
    public InvalidTemperatureException(String message) {
        super(message);
    }
}
