package com.zt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/hi")
    public String Hi(){
        return  "hello world!";
    }
}
