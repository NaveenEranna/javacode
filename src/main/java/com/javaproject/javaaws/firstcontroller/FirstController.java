package com.javaproject.javaaws.firstcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String getAMessahe() {
        return "MyFirstAwsProject";
    }

}
