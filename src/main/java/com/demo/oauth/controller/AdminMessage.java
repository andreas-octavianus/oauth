package com.demo.oauth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminMessage {

    @RequestMapping("/message")
    public String getMessage() {
        return "Admin Message";
    }

}
