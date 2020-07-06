package com.tomcatlogs.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/list")
    @ResponseBody
    public String list() {
        Logger logger1 = LogManager.getLogger(this.getClass());
        Logger logger2 = LogManager.getLogger("BusinessFile");

        logger1.info("hello,this is in errorlog");
        logger2.info("hello,this is in businesslogge");

        return "this is list";
    }
}
