package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.GlobalUser;
import com.example.demo.Models.Question;
import com.example.demo.Models.Responses;
import com.example.demo.Repositories.ResponseRepository;

@Service
public class ResponseService {

	@Autowired
	private ResponseRepository responseRepository;
	@Autowired
	GlobalUser currentUser;
	List<Question> responses = new ArrayList<Question>();
	
	
	public int recordResponses(Question response) {
		responses.add(response);
		return 1;
	}
	
	
	public int insertResponses()
	{
		Responses responseObject = new Responses();
		responseObject.setId(currentUser.getId());
		responseObject.setName(currentUser.getName());
		responseObject.setQuestions(responses);
		
		responseRepository.save(responseObject);
		responses.clear();
		
		return 1;
	}
	
	
}
