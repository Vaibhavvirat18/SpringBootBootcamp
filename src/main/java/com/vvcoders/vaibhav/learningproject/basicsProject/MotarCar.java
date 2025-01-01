package com.vvcoders.vaibhav.learningproject.basicsProject;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

public class MotarCar {

    void startMotarCar() {
        System.out.println("Motar Car started...");
    }

    @PostConstruct
    void firstMethodToRunAfterBeanCreation(){
        System.out.println("All check!! Bean creation of MotarCar is successful....");
    }

    @PreDestroy
    void lastMethodToRunBeforeBeanDestroys() {
        System.out.println("Ready to destroy the bean MotarCar....");
    }
}













