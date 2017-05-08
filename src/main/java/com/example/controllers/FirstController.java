package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.domain.Person;

@Controller
public class FirstController{

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	protected ModelAndView handleRequestInternal(){
		System.out.println("In the controller");
		ModelAndView modelAndView = new ModelAndView("computation");
		return modelAndView;
	}
	
	@RequestMapping(value = "/formSubmit.html", method = RequestMethod.POST)
	public ModelAndView newMethod(@ModelAttribute("person") Person person){
		
		ModelAndView andView = new ModelAndView("showMessage");
		return andView;
	}
	
	@RequestMapping(value = "/getAnswer", method = RequestMethod.GET)
	@ResponseBody 
	public String giveAnswer(){
		System.out.println("Working");
		return "Finally we have a Touch Down";
	}
	
}
