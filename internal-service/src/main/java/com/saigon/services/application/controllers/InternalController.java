package com.saigon.services.application.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/internal")
public class InternalController {
  
  @GetMapping("/helth")
  public ResponseEntity<String> helthCheck() {
    return new ResponseEntity<>("UP", HttpStatus.OK);
  }

}
