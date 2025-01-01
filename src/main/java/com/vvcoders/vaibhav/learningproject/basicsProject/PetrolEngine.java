package com.vvcoders.vaibhav.learningproject.basicsProject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PetrolEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Petrol Engine started....");
    }
}
