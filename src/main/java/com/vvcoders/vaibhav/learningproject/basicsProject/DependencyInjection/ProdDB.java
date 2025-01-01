package com.vvcoders.vaibhav.learningproject.basicsProject.DependencyInjection;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name= "deploy.env", havingValue = "production")
public class ProdDB implements DbData{
    @Override
    public String gettData() {
        return "Prod DB";
    }
}
