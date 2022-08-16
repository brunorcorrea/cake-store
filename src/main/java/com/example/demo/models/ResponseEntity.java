package com.example.demo.models;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ResponseEntity {
    private String message;

    public static ResponseEntity from(String message) {
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setMessage(message);

        return responseEntity;
    }
}
