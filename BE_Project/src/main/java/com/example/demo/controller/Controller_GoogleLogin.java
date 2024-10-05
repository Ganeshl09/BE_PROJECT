package com.example.demo.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Entity_GoolgeLogin_UserData;
import com.example.demo.entity.Entiy_GoogleLogin;
import com.example.demo.security.AES_Algorithm;
import com.example.demo.service.Service_GoogleLogin;
import com.example.demo.service.Service_GoogleLogin_UserData;

@Controller
public class Controller_GoogleLogin {
	@Autowired
	private Service_GoogleLogin Service_GoogleLogin;
	@Autowired
	private  Service_GoogleLogin_UserData Service_GoogleLogin_UserData;
	@Autowired
	private AES_Algorithm alorithm;

	final String secretKey = "ssshhhhhhhhhhh!!!!";
	
	@RequestMapping("/Login")
	public ModelAndView Question() throws UnsupportedEncodingException
	{	
		
    	ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.jsp");
        return modelAndView;
	}
	
	
	@RequestMapping(value="/Login_mesvalidation" ,method = RequestMethod.GET)
	public ModelAndView Answer(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse)
	{	
		//get data from index.jsp
		 String googleid =httpServletRequest.getParameter("id");
		 String email =httpServletRequest.getParameter("email");
		 String name =httpServletRequest.getParameter("name");
		 String img_url =httpServletRequest.getParameter("imgurl");
		 String designation = null,branch = null; int id = 0;
		 
		 //check mes user or not using Entiy_GoogleLogin database
		 java.util.List<Entiy_GoogleLogin> userdata =Service_GoogleLogin.getUserByEmailID(email);
		 for(Entiy_GoogleLogin Entiy_GoogleLogin:userdata)
		 {
			 designation= Entiy_GoogleLogin.getDesignation();
		 }
		if(userdata.size()!=0)
		{
			//check mes user profile is empty or not  using Service_GoogleLogin_UserData database
			 if(Service_GoogleLogin_UserData.getUserByEmail(email).size()!=0)
			 {
				 for(Entity_GoolgeLogin_UserData Entity_GoolgeLogin_UserData:Service_GoogleLogin_UserData.getUserByEmail(email))
				 {
						ModelAndView modelAndView = new ModelAndView();
						modelAndView.addObject("email", Entity_GoolgeLogin_UserData.getEmail());
						modelAndView.setViewName("home.jsp");
				        return modelAndView;
				 }
			
			 }
			 else
			 {
				 	// get permenat data from  Entiy_GoogleLogin database
				 	for(Entiy_GoogleLogin Entiy_GoogleLogin : userdata)
					{
						 designation = Entiy_GoogleLogin.getDesignation();
						 branch = Entiy_GoogleLogin.getBranch();
						 id = Entiy_GoogleLogin.getUserid();
						 
					}
					// send data to Set_EmployeeProfile page
				 	ModelAndView modelAndView = new ModelAndView();
				 	modelAndView.addObject("email", email);
				 	modelAndView.addObject("name", name);
				 	modelAndView.addObject("img_url", img_url);
				 	modelAndView.addObject("designation", designation);
				 	modelAndView.addObject("branch", branch);
					modelAndView.addObject("id", id);
					modelAndView.setViewName("Set_EmployeeProfile.jsp");
					
			        return modelAndView;
				 
			 }
		}
		else
		{
			   	System.out.println("false");
				ModelAndView modelAndView = new ModelAndView();
				modelAndView.setViewName("re-login.jsp");
		        return modelAndView;	
		}
		return null;

	}
}
