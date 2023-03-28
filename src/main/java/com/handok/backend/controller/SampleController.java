package com.handok.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/hello")
public class SampleController {

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return new ResponseEntity<>("Hello World !!!", HttpStatus.OK);
    }
}
