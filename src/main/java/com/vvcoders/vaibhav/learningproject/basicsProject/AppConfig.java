package com.vvcoders.vaibhav.learningproject.basicsProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    MotarCar getMotarCar(){
        return new MotarCar();
    }
}
