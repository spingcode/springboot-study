package com.java.code.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zouw
 * @date Created in 9:50 PM 2019/5/9
 */
@Controller
public class HelloWorld {
    /*@RequestMapping({"/","/index.html"})
    public String index() {
        return "index";
    }*/

     @RequestMapping({"/aaa","/index.html"})
    public String index() throws Exception {
        throw new  Exception("zzz");
    }

}
