package com.sriv.shivam.jwtauthtut.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @RequestMapping(method = RequestMethod.GET, value = "/welcome")
    public String welcome() {
        return "Welcome to private page.";
    }
}
