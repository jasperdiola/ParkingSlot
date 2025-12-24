package com.parkingSlot.Model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ApiErrorModel {
    private int status;
    private String error;
    private String message;
    private String path;
    private LocalDateTime timestamp;

    public ApiErrorModel(int status, String error, String message, String path) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
        this.timestamp = LocalDateTime.now();
    }

}
