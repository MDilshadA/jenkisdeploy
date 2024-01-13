package com.jenkinsDeploy.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RController {

    @RequestMapping("/rest")
    public String Rest(){
        return "Rest Controller";
    }
}
