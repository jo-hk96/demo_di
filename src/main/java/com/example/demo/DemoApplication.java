package com.example.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import com.example.loose.DripCoffeeMachine;
import com.example.loose.EspressoMachine;
import com.example.loose.CoffeeMaker;



@SpringBootApplication
@ImportResource("clsspath:beans.xml")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		//tight 
		//CoffeeMaker coffeeMaker = new CoffeeMaker();
		//coffeeMaker.makeCoffee();
		
		
		//loose
		CoffeeMaker coffeeMaker = new CoffeeMaker();
		//coffeeMaker.setCoffeeMaker(new EspressoMachine());
		coffeeMaker.setCoffeeMaker(new DripCoffeeMachine());
		coffeeMaker.makeCoffee();
	}

}
