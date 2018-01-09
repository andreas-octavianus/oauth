package com.demo.resourceserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecretController {

    @RequestMapping("/secret")
    public String secret() {
        return "Secret";
    }

}
