package com.vvcoders.vaibhav.learningproject.basicsProject;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class MotarBike implements InitializingBean {

    void startMotarBike(){
        System.out.println("Motar Bike started...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("All check!! Bean creation of MotarBike is successful....");
    }
}