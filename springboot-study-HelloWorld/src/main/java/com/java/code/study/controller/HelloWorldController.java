package com.java.code.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    @RequestMapping(value = "/helloworld/test",method = RequestMethod.GET)
    public String test(@RequestParam("id") String id) {
        System.out.println("id:"+id);
        return "helloworld"+id;
    }
}
