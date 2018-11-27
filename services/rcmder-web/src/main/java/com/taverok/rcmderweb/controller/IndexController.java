package com.taverok.rcmderweb.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.annotation.PostConstruct;

@Slf4j
@RestController
public class IndexController implements ApplicationContextAware{
    private ApplicationContext applicationContext;

    @GetMapping("/")
    public String index(){
        return "OK";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @PostConstruct
    private void init(){
        applicationContext
                .getBean(RequestMappingHandlerMapping.class)
                .getHandlerMethods()
                .forEach( (r, m)-> log.warn(r.toString()));
    }
}
