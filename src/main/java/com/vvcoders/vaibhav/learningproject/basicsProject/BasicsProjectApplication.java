package com.vvcoders.vaibhav.learningproject.basicsProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicsProjectApplication implements CommandLineRunner {

	@Autowired
	MotarBike motarBike;

	@Autowired
	MotarBike motarBike1;

	@Autowired
	MotarCar motarCar;

	@Autowired
	Bus bus;

	public static void main(String[] args) {
		SpringApplication.run(BasicsProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		motarBike.startMotarBike();
		motarBike1.startMotarBike();
		motarCar.startMotarCar();
		bus.startBus();
	}
}
