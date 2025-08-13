package com.exceptionhandling.exceptionhandlingdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
public class Controller {

    @GetMapping("/getService")
    public ResponseEntity<?> getService(){

        return  ResponseEntity.ok("Hello World");
    }
}
