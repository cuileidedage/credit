package com.aaa.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
    /**
     * 打印HelloWorld
     */
    @PostMapping("/helloworld")
    public String HelloWorld(){
         //System.out.println("HelloWorld");
        return  "hello world";
    }
}
