package com.example.controllers;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyFirstInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		Calendar cal = Calendar.getInstance();		
		int day = cal.get(Calendar.DAY_OF_WEEK);		
		if(day == 4){
			response.getWriter().write("Bugger off my man, wrong day of the week!!");
			return false;
		}		
		return true;
	}
	
	
	
}
