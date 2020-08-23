package com.tibjoz.checkmarxeval1.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloResource controller
 */
@RestController
@RequestMapping("/api/hello")
public class HelloResource {

    private final Logger log = LoggerFactory.getLogger(HelloResource.class);

    /**
    * GET hello
    */
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    /**
    * POST test
    */
    @PostMapping("/test")
    public String test() {
        return "test";
    }

}
