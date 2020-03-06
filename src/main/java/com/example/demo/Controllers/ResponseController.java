package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Models.GlobalUser;
import com.example.demo.Models.Question;
import com.example.demo.Models.Stepper;
import com.example.demo.Models.Users;
import com.example.demo.Services.ResponseService;
import com.example.demo.Services.UserService;

@Controller
public class ResponseController {
	
	@Autowired
	private ResponseService responseService;
	@Autowired
	private UserService userService;
	@Autowired
	Stepper stepper;
	@Autowired
	GlobalUser currentUser;
	
	@RequestMapping("/startQuestionnaire")
	public String startQuestions(Model model, Users user) {
        stepper.setStep(1);
        currentUser.setId(user.getId());
        currentUser.setName(user.getName());
        userService.insertUsers(user);
        model.addAttribute("stepper",stepper);
		return "Questionnaire";
	}
	
	@RequestMapping(value = "/nextQuestion", method = RequestMethod.POST)
	public String nextQuestion(Model model,Question question)
	{
		
		int step = stepper.getStep();
		step++;
		stepper.setStep(step);
		responseService.recordResponses(question);
		model.addAttribute("stepper",stepper);
		if(stepper.getStep()>3)
		{
			responseService.insertResponses();
			return "EndPage";
		}
		return "Questionnaire";
	}
	

}