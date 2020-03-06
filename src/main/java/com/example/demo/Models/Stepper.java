package com.example.demo.Models;

import org.springframework.stereotype.Component;

@Component
public class Stepper {

	public int step;

	public Stepper() {
		super();
		this.step = 0;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}
	
}
