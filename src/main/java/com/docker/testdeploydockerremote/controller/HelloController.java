package com.docker.testdeploydockerremote.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public ResponseEntity<?> hello(){

        return ResponseEntity.ok("KOMO gaul");

    }

}
