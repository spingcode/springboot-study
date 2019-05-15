package com.java.code.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author zouw
 * @date Created in 10:37 PM 2019/5/9
 */
@Controller
public class LoginController {

    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String userName, @RequestParam("password") String password, Map<String,Object> map, HttpSession session) {
        if (userName != null && password.equals("123456")) {
            session.setAttribute("loginUser",userName);
            return "redirect:/main.html";
        } else {
            map.put("msg","用户名密码错误");
            return "login";
        }

    }
}
