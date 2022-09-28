package com.sahar.sahar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Idk {
//    Logger logger = LoggerFactory.getLogger(Idk.class);
    static final Logger logger = LoggerFactory.getLogger(Idk.class);

    @GetMapping("/message")
    public String getmessage(){
        logger.info("info message");
        logger.warn("warning message");
        logger.error("error message");
        logger.debug("debug message");
        logger.trace("trace message");
        return ("open consol");
    }
}
