package com.example.demo.Models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Responses {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column 
	String name;
	
	@Column
	private String question1;
	
	@Column
	private String question2;
	
	@Column
	private String question3;
	

	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuestion1() {
		return question1;
	}

	public void setQuestion1(String question1) {
		this.question1 = question1;
	}

	public String getQuestion2() {
		return question2;
	}

	public void setQuestion2(String question2) {
		this.question2 = question2;
	}

	public String getQuestion3() {
		return question3;
	}

	public void setQuestion3(String question3) {
		this.question3 = question3;
	}

	public void setQuestions(List<Question> questions)
	{
		int ctr = 1;
		for (Question response: questions)
		{
			String s1 = "Response 1 : "+ response.getResponse1();
			String s2 = s1 + " Response 2 : " + response.getResponse2();
			setResponses(s2,ctr);
			ctr++;
		}
		
	}
	
	public void setResponses(String s, int question)
	{
		switch(question)
		{
		case 1: question1 = s;
		break;
		case 2: question2 = s;
		break;
		case 3: question3 = s;
		break;
		default: System.out.println("ASdfas");
		
		}
	}
	

}
