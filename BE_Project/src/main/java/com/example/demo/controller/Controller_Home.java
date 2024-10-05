package com.example.demo.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller_Home {
	@RequestMapping("/Home")
	public ModelAndView getoHome(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws UnsupportedEncodingException
	{	
		String email =httpServletRequest.getParameter("email");
    	ModelAndView modelAndView = new ModelAndView();
    	modelAndView.addObject("email", email);
        modelAndView.setViewName("home.jsp");
        return modelAndView;
	}
}
