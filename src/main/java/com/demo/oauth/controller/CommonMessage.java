package com.demo.oauth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common")
public class CommonMessage {

    @RequestMapping("/message")
    public String getMessage() {
        return "Common Message";
    }

}
