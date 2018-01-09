package com.demo.oauth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserMessage {

    @RequestMapping("/message")
    public String getMessage() {
        return "User Message";
    }

}
