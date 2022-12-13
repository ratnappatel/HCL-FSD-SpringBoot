package com.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.boot.pojo.User;

@Controller

public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView sayHello()
	{
		return new ModelAndView("hello");
	}

	@RequestMapping("/user")
	public ModelAndView getUserDetails()
	{	
		ModelAndView mv=new ModelAndView();
		User u=new User(101,"abc");
		mv.addObject(u);
		mv.setViewName("userDetails");
		return mv;
		
	}
}
