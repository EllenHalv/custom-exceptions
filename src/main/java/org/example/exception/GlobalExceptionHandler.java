package org.example.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InvalidTemperatureException.class)
    public ResponseEntity<ErrorResponse> handleSNMPRequestException(InvalidTemperatureException e) {
        ErrorResponse errorResponse = new ErrorResponse(
                LocalDateTime.now(),
                HttpStatus.BAD_GATEWAY.value(),
                HttpStatus.BAD_GATEWAY.getReasonPhrase(),
                e.getMessage()
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_GATEWAY);
    }
}