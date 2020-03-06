package com.example.demo.Models;

import org.springframework.stereotype.Component;

@Component
public class Question {
	
	
	int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	String response1;
	
	String response2;

	public String getResponse1() {
		return response1;
	}

	public void setResponse1(String response1) {
		this.response1 = response1;
	}

	public String getResponse2() {
		return response2;
	}

	public void setResponse2(String response2) {
		this.response2 = response2;
	}
}
