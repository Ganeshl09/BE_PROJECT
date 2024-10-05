package com.example.demo.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Entity_Chat_Messages;
import com.example.demo.entity.Entity_Chat_Users;
import com.example.demo.entity.Entity_GoolgeLogin_UserData;
import com.example.demo.service.Service_Chat_Messages;
import com.example.demo.service.Service_GoogleLogin_UserData;

@RestController
public class Controller_Chat {
	@Autowired
	public Service_GoogleLogin_UserData  Service_GoogleLogin_UserData;
	@Autowired
	public Service_Chat_Messages  Service_Chat_Messages;
	int loginid,receiveremailid,commonid,deleteid;
	String loginimg = null,loginusername = null,loginemail=null;
	
	//on page open
	@RequestMapping("/Chat")
	public ModelAndView goToChat(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws UnsupportedEncodingException
	{	
		//get login mail
		 String email =httpServletRequest.getParameter("email");
		 loginemail=email;
		 //get data of login mail
		 List<Entity_GoolgeLogin_UserData>Data = Service_GoogleLogin_UserData.getUserByEmail(email);
		 for(Entity_GoolgeLogin_UserData Entity_GoolgeLogin_UserData:Data)
		 {
			 loginimg=Entity_GoolgeLogin_UserData.getImg_url();
			 loginusername=Entity_GoolgeLogin_UserData.getName();
			 loginid=Entity_GoolgeLogin_UserData.getId();
		 }
		 //if chats are preset then it shows on left panal by last message
		 List<Entity_GoolgeLogin_UserData>Users = Service_GoogleLogin_UserData.getusers();
		//send login user data to jsp page
       	ModelAndView modelAndView = new ModelAndView();
    	modelAndView.addObject("loginemail", loginemail);
    	modelAndView.addObject("loginimg", loginimg);
    	modelAndView.addObject("loginusername", loginusername);
    	modelAndView.addObject("Users", Users);
        modelAndView.setViewName("Chat.jsp");
        return modelAndView;
	}
	
	@RequestMapping("/GetByName")
	public ModelAndView getByName(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws UnsupportedEncodingException
	{	
		  //find user  by name
		   String name=httpServletRequest.getParameter("name");
		   List<Entity_GoolgeLogin_UserData>Data = Service_GoogleLogin_UserData.getUserByName(name);
		   //send login user data to jsp page
		   ModelAndView modelAndView = new ModelAndView();
	    	modelAndView.addObject("loginemail", loginemail);
	    	modelAndView.addObject("loginimg", loginimg);
	    	modelAndView.addObject("loginusername", loginusername);
	    	modelAndView.addObject("Users", Data);
	        modelAndView.setViewName("Chat.jsp");
	        return modelAndView;
	}
	@RequestMapping("/getChatByClick")
	public ModelAndView getChatByClick(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws UnsupportedEncodingException
	{	
		   
	   	   String email =httpServletRequest.getParameter("useremail");
	      //get Heder data  by Onclick name on right panal top
		   List<Entity_GoolgeLogin_UserData>UserData = Service_GoogleLogin_UserData.getUserByEmail(email);
		   for(Entity_GoolgeLogin_UserData Entity_GoolgeLogin_UserData :UserData)
		   {
			   receiveremailid =Entity_GoolgeLogin_UserData.getId();
		   }
		   //chats on left panal 
			List<Entity_GoolgeLogin_UserData>Users = Service_GoogleLogin_UserData.getusers();
			
			//get commonid to store in message table
		    commonid = loginid+receiveremailid;	
		    String strcommonid=String.valueOf(commonid);
		    
			//get messages  by Onclick name on left panal 
			List<Entity_Chat_Messages>Messages = Service_Chat_Messages.getCommonId(strcommonid);
			
		   ModelAndView modelAndView = new ModelAndView();
	    	modelAndView.addObject("loginemail", loginemail);
	    	modelAndView.addObject("loginimg", loginimg);
	    	modelAndView.addObject("loginusername", loginusername);
	    	modelAndView.addObject("Users", Users);
	    	modelAndView.addObject("UserData", UserData);
	    	modelAndView.addObject("Messages", Messages);
	        modelAndView.setViewName("Chat.jsp");
	        return modelAndView;
	}
	@RequestMapping("/SendMessage")
	public ModelAndView sendMessage(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws UnsupportedEncodingException
	{	
		   //get sender and  receiver data
	   	   String senderemail =httpServletRequest.getParameter("sernderemail");
		   String receiveremail=httpServletRequest.getParameter("receiveremail");
		   String receivername=httpServletRequest.getParameter("receivername");
		   String receiverimg=httpServletRequest.getParameter("receiverimg");
		   String message=httpServletRequest.getParameter("message");
		   
		  //get receiveremail id
		   List<Entity_GoolgeLogin_UserData>UserData = Service_GoogleLogin_UserData.getUserByEmail(receiveremail);
			   for(Entity_GoolgeLogin_UserData Entity_GoolgeLogin_UserData :UserData)
			   {
				   receiveremailid =Entity_GoolgeLogin_UserData.getId();
			   }
			
			//get commonid to store in message table
		    commonid = loginid+receiveremailid;
		    String strcommonid=String.valueOf(commonid);
		    
		    
		    Entity_Chat_Messages Entity_Chat_Messages =new Entity_Chat_Messages(message, senderemail, receiveremail, strcommonid);
			Service_Chat_Messages.save(Entity_Chat_Messages);
			
			//get messages  by Onclick name on left panal 
			List<Entity_Chat_Messages>Messages = Service_Chat_Messages.getCommonId(strcommonid);
			
			//if chats are preset then it shows on left panal by last message
			List<Entity_GoolgeLogin_UserData>Users = Service_GoogleLogin_UserData.getusers();
		   ModelAndView modelAndView = new ModelAndView();
	    	modelAndView.addObject("loginemail", loginemail);
	    	modelAndView.addObject("loginimg", loginimg);
	    	modelAndView.addObject("loginusername", loginusername);
	    	modelAndView.addObject("Users", Users);
	    	modelAndView.addObject("Messages", Messages);
	    	modelAndView.addObject("UserData", UserData);
	        modelAndView.setViewName("Chat.jsp");
	        return modelAndView;
		 
	}
}
