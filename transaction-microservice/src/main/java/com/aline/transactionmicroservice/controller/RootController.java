package com.aline.transactionmicroservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RootController {

    /**
     * Health Check endpoint
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public void healthCheck() {}

}