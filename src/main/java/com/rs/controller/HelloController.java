package com.rs.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/dockerhello")
    public ResponseEntity<String> getHelloMessage(){
        return new ResponseEntity<String>("!! Hello from Spring & Docker!!", HttpStatus.ACCEPTED);
    }

}
