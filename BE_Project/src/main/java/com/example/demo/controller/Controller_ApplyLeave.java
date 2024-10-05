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
import com.example.demo.entity.Entity_GoolgeLogin_UserData;
import com.example.demo.entity.Entity_Leave_Request;
import com.example.demo.entity.Entity_Leaves;
import com.example.demo.service.Service_GoogleLogin_UserData;
import com.example.demo.service.Service_Leaves;
import com.example.demo.service.Service_Leaves_Request;

@RestController
public class Controller_ApplyLeave {
	@Autowired 
	private Service_Leaves Service_Leaves;
	@Autowired 
	private Service_Leaves_Request Service_Leaves_Request ;
	@Autowired 
	private Service_GoogleLogin_UserData Service_GoogleLogin_UserData;
	String email,senderbranch,img,designation,from,to,name;
	@RequestMapping("/GoToLeavePage")
	public ModelAndView GoToLeavePage(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws UnsupportedEncodingException
	{	
	    email =httpServletRequest.getParameter("email");
		List<Entity_GoolgeLogin_UserData> userbrach = Service_GoogleLogin_UserData.getUserByEmail(email);
		for(Entity_GoolgeLogin_UserData Entity_GoolgeLogin_UserData :userbrach)
		{
			senderbranch =Entity_GoolgeLogin_UserData.getEntiy_GoogleLogin().getBranch();
			img=Entity_GoolgeLogin_UserData.getImg_url();
			designation=Entity_GoolgeLogin_UserData.getEntiy_GoogleLogin().getDesignation();
			name=Entity_GoolgeLogin_UserData.getName();
		}
		String leavetype =httpServletRequest.getParameter("type");
		Entity_Leaves data = Service_Leaves.getByEmail(email);
		

		ModelAndView modelAndView = new ModelAndView();
    	modelAndView.addObject("email", email);
    	if(designation.equals("Employee"))
		{
			modelAndView.addObject("Login_designation", "");
		}
		else
		{
			modelAndView.addObject("Login_designation", "Requests");
		}
    	modelAndView.addObject("leavetype", leavetype);
    	
		if(leavetype.equals("Casual"))
		{
			modelAndView.addObject("Leave", data.getCasualLeave());
		}
		else if(leavetype.equals("Medical")){
			modelAndView.addObject("Leave", data.getMedicalLeave());
		}
		else if(leavetype.equals("Sick")){
			modelAndView.addObject("Leave", data.getSickLeave());
		}
		else if(leavetype.equals("Earned")){
			modelAndView.addObject("Leave", data.getEarnedLeave());
		}
		else {
			modelAndView.addObject("Leave", data.getOutdoorDuty());
	       
		}
		 modelAndView.setViewName("ApplyLeave.jsp");
		return modelAndView;
	}	
	
	@RequestMapping("/getLeaveReq")
	public ModelAndView getReq(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws UnsupportedEncodingException
	{	
		String  rem =httpServletRequest.getParameter("rem");
		String  fromdate =httpServletRequest.getParameter("from");
		String  todate =httpServletRequest.getParameter("to");
		String  noOfDays =httpServletRequest.getParameter("nod");
		int nod= Integer.parseInt(noOfDays);
		String  reason =httpServletRequest.getParameter("reason");
		String  leavetype =httpServletRequest.getParameter("leavetype");
		String status = null;
		if(designation.equals("Employee"))
		{    
			 from="Employee";	
			 to="HOD";
		}else {
			 from="HOD";	
			 to="Principle";
		} 
		Entity_Leave_Request Entity_Leave_Request = new Entity_Leave_Request(fromdate, todate, to, from, senderbranch, img, reason, status, leavetype, name,nod,email);
		Service_Leaves_Request.saveRequest(Entity_Leave_Request);
		ModelAndView modelAndView = new ModelAndView();
    	modelAndView.addObject("email", email);
        modelAndView.setViewName("home.jsp");
		return modelAndView;
	}	
}
