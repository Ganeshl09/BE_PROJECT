package com.example.demo.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Entity_GoolgeLogin_UserData;
import com.example.demo.entity.Entiy_GoogleLogin;
import com.example.demo.service.Service_GoogleLogin;
import com.example.demo.service.Service_GoogleLogin_UserData;

@Controller
public class Controller_GoogleLogin_UserData {
	@Autowired
	private Service_GoogleLogin_UserData Service_GoogleLogin_UserData;
	@Autowired
	private Service_GoogleLogin Service_GoogleLogin;
	
	@RequestMapping(value="/SaveUserProfile",method = RequestMethod.POST)
	public ModelAndView SaveUserProfile(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws UnsupportedEncodingException
	{
		
		String name =httpServletRequest.getParameter("name");
		String email =httpServletRequest.getParameter("email");
		String designation =httpServletRequest.getParameter("designation");
		String branch =httpServletRequest.getParameter("branch");
		String img_url =httpServletRequest.getParameter("img_url");
		String phone =httpServletRequest.getParameter("phone");
		String date =httpServletRequest.getParameter("birthday");
		String gender =httpServletRequest.getParameter("gender");
		String id =httpServletRequest.getParameter("id");
		int Id = Integer.parseInt(id);
		
    	Entiy_GoogleLogin userdata = Service_GoogleLogin.getUserByUserId(Id);
   
		Entity_GoolgeLogin_UserData Entity_GoolgeLogin_UserData  = new Entity_GoolgeLogin_UserData(email, name, img_url, gender, date, userdata);
		Service_GoogleLogin_UserData.save(Entity_GoolgeLogin_UserData);
		
		Service_GoogleLogin_UserData.save(Entity_GoolgeLogin_UserData);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("email", email);
		modelAndView.setViewName("home.jsp");
        return modelAndView;
	}
	
}
