package com.example.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
}
