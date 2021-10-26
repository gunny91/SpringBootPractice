package com.vipbuilding.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VipController {

    @GetMapping("/tempHello")
    public String[] tempHello(){
        return new String[]{"This is my", "Area"};
    }

}
