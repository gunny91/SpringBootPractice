package com.example.springboot_ex2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RunController {

    @GetMapping("tempTest")
    public String[] tempString()
    {
        return new String[]{"HEllo", "THis is m area"};

    }

}
