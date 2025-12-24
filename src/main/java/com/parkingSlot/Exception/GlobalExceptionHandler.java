package com.parkingSlot.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.parkingSlot.Model.ApiErrorModel;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ParkingSlotNotFoundException.class)
    public ResponseEntity<ApiErrorModel> handleNotFound(
            ParkingSlotNotFoundException ex,
            HttpServletRequest request) {
                
        ApiErrorModel error = new ApiErrorModel(
                HttpStatus.NOT_FOUND.value(),
                HttpStatus.NOT_FOUND.getReasonPhrase(),
                ex.getMessage(),
                request.getRequestURI()
        );

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
