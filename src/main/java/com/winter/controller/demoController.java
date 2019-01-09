package com.winter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class demoController {
    @RequestMapping(value="/demo")
    public String demo(){
        return "user";
    }
}
