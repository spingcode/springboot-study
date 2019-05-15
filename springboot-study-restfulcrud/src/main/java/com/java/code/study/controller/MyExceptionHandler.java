package com.java.code.study.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zouw
 * @date Created in 9:21 PM 2019/5/11
 */
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String, Object> handleException(Exception e) {
        Map<String,Object> map = new HashMap<>();
        map.put("code","userNoExist");
        map.put("message",e.getMessage());
        return map;
    }
}
