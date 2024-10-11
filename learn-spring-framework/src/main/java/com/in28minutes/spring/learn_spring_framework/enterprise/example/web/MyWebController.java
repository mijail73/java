package com.in28minutes.spring.learn_spring_framework.enterprise.example.web;

import com.in28minutes.spring.learn_spring_framework.enterprise.example.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MyWebController {

    @Autowired
    public BusinessService businessService;

    public long returnValueFromBusinessService() {
        return businessService.calculateSum();
    }
}