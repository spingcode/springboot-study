package com.java.code.study.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    private static Logger logger =  LoggerFactory.getLogger(LogController.class);

    static {
        logger.trace("我是 trace");
        logger.debug("我是 debug");
        logger.info("我是 info");
        logger.warn("我是 warn");
        logger.error("我是 error");
    }
}
