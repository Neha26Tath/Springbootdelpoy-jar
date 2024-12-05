package com.fullstack.springbootcorex.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Applicationcontroller {

    @GetMapping
    public ResponseEntity <String> hello() {
        return ResponseEntity.ok("Welcome to fullstack java developer pune");
    }

    @GetMapping("/contact-us")
    public ResponseEntity <String> contactUs() {
        return ResponseEntity.ok("Please Contact us at fullstack java developer pune ");
    }
}
