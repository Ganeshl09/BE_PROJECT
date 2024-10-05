package com.example.demo.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Entity_Blog_AddData;
import com.example.demo.service.Service_Blog_AddData;

@RestController
public class Controller_ViewDocument {
	@Autowired
	private Service_Blog_AddData Service_Blog_AddData;
	
	@RequestMapping("/ViewDocument")
	public ModelAndView goToViewDocument(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws UnsupportedEncodingException
	{	
		
		String file =httpServletRequest.getParameter("file");
		
    	ModelAndView modelAndView = new ModelAndView();
    	modelAndView.addObject("file", file);
        modelAndView.setViewName("documentViewer.jsp");
        return modelAndView;
	}	
}
