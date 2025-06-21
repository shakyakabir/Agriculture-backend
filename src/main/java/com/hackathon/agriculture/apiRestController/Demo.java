package com.hackathon.agriculture.apiRestController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/")
@RestController
public class Demo {

    @GetMapping("/greeting")
    public String greeting() {
        return "hello there";
    }
}
