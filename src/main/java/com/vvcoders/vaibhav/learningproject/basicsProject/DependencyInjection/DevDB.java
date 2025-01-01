package com.vvcoders.vaibhav.learningproject.basicsProject.DependencyInjection;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name= "deploy.env", havingValue = "development")
public class DevDB implements DbData{
    @Override
    public String gettData() {
        return "Dev DB";
    }
}
