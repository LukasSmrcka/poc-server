package com.luk3c;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoOfConfiguration1Controller {

    @Value("${demo.color}")
    private String injectedWithoutSetter;

    @RequestMapping(value = "/demo-color")
    public String demoColor() {

        return "Color is:" + injectedWithoutSetter;
    }
}
