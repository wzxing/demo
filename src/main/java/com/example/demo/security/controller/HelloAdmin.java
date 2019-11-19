package com.example.demo.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class HelloAdmin {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String test() {
        return "hello test";
    }

}
