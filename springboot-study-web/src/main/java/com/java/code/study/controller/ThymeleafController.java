package com.java.code.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zouw
 * @date Created in 9:57 PM 2019/5/6
 */
@Controller
public class ThymeleafController {

    @RequestMapping(value = "/getSucess")
    public String getSucess() {
        //classpath:templates/success.html
        return "success";
    }
}
