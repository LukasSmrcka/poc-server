package com.luk3c;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix="demo")
public class DemoOfConfiguration2Controller {

    //Setter and @ConfigurationProperties is needed to inject the value from configuration
    private String attitude;

    private String relaxedBinding;

    @RequestMapping(value = "/demo-attitude")
    public String demoAttitude() {

        return "Attitude is " + attitude + " and binding is " + relaxedBinding;
    }

    public void setAttitude(String attitude) {
        this.attitude = attitude;
    }

    public void setRelaxedBinding(String relaxedBinding) {
        this.relaxedBinding = relaxedBinding;
    }


}
