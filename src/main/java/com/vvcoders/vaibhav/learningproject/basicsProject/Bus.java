package com.vvcoders.vaibhav.learningproject.basicsProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bus {

    @Autowired
    Engine engine;

    void startBus(){
        engine.start();
    }

}
