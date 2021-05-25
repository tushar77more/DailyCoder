package com.rainclouds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class StudentController {

	@RequestMapping("/home")
	public ModelAndView homePage() {
		ModelAndView mv =new ModelAndView();
		System.out.println("hello");
		mv.setViewName("Student.jsp");
		return mv;
	}
}
