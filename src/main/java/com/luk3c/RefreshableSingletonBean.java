package com.luk3c;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RefreshScope
public class RefreshableSingletonBean {

    @PostConstruct
    public void postConstruct() {
        System.out.println("Singleton created!!!");
    }

    public void call() {
        System.out.println("Singleton called!!!");
    }
}
