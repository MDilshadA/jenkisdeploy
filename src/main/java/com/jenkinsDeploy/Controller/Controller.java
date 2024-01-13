package com.jenkinsDeploy.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/jen")
public class Controller {

    @RequestMapping("/")
    public String test(){
        return "index";
    }

    @GetMapping("/log")
    public String login(){
        return "login";
    }
}
