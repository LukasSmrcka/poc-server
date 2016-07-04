package com.luk3c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoOfRefreshableBeanController {

    @Autowired
    RefreshableSingletonBean singletonBean;

    @RequestMapping(value = "/demo-refresh")
    public String demoRefresh() {
        singletonBean.call();
        return "Refreshable singleton called!!!";
    }
}
