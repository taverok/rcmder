package com.taverok.rcmderweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController extends BaseController {

    @GetMapping("/")
    public String index(){
        return "OK";
    }
}
