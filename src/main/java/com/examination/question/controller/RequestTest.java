package com.examination.question.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestTest {

    /**
     * url: http://localhost:8080/Rtest
     * @return
     */
    @RequestMapping("Rtest")
    public String Rtest(){
        return "Rtest";
    }

}
