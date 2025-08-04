package com.example.loose;

public class CoffeeMaker {
	private CoffeeMachine coffeeMachine;
	
	public void setCoffeeMaker(CoffeeMachine coffeeMachine) {
		this.coffeeMachine = coffeeMachine;
	}
	
	public void makeCoffee() {
		System.out.println(coffeeMachine.brew());
		
	}
		
}
