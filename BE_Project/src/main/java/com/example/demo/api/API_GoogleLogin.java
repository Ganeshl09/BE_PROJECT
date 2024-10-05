package com.example.demo.api;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Entity_Blog_AddData;
import com.example.demo.entity.Entity_Chat_Messages;
import com.example.demo.entity.Entity_GoolgeLogin_UserData;
import com.example.demo.entity.Entiy_GoogleLogin;
import com.example.demo.security.AES_Algorithm;
import com.example.demo.service.Service_Blog_AddData;
import com.example.demo.service.Service_Chat_Messages;
import com.example.demo.service.Service_GoogleLogin;
import com.example.demo.service.Service_GoogleLogin_UserData;


@RestController
public class API_GoogleLogin {
		@Autowired
		private Service_GoogleLogin Service_GoogleLogin;
		@Autowired
		private AES_Algorithm AES_Algorithm;
		@Autowired
		private Service_Blog_AddData Service_Blog_AddData;
		@Autowired
		private Service_Chat_Messages  Service_Chat_Messages;
		@Autowired
		private Service_GoogleLogin_UserData  Service_GoogleLogin_UserData;
		
		final String secretKey = "ssshhhhhhhhhhh!!!!";
		
		
		@GetMapping("/api/login/getAllusers")
		public List<Entiy_GoogleLogin> getData() {
			return Service_GoogleLogin.getusers();
		}
		@PostMapping("/api/login/insertUser")
		public Entiy_GoogleLogin users( @RequestBody Entiy_GoogleLogin user) {
			System.out.println("Inserted Email :"+user.getEmail());
			return Service_GoogleLogin.save(user);
		}
		
		@GetMapping("/Blogid/{id}")
		public  Entity_Blog_AddData getBlogId(@PathVariable int id)  {
			return Service_Blog_AddData.getById(id);
		}
		
		@PostMapping
		public void uploadFile(@RequestParam("file")MultipartFile  file) throws IllegalStateException, IOException
		{
			System.out.println("----------sad");
		//	Service_Blog_AddData.upload(file);
		}
		@PostMapping("/msg")
		public Entity_Chat_Messages msg( @RequestBody Entity_Chat_Messages msg) {
			System.out.println("Inserted Email :"+msg);
			return Service_Chat_Messages.save(msg);
		}
		@GetMapping("/aisc")
		public List<Entiy_GoogleLogin> mxsg( ) {
			return Service_GoogleLogin.getusersByAisc();
		}
		@GetMapping("/getmsg")
		public Entity_Chat_Messages getmsg( ) {
		List<Entity_Chat_Messages> allmsg =Service_Chat_Messages.getMessages();
			for(Entity_Chat_Messages Entity_Chat_Messages : allmsg)
			{
				System.out.println(""+Entity_Chat_Messages.getMessage());
			}
			
			List<Entity_Chat_Messages> allmsgs =Service_Chat_Messages.getMessagesBetweenUser("panchal", "gaurav");
			System.out.println(""+allmsgs.size());
			for(Entity_Chat_Messages Entity_Chat_Messages : allmsgs)
			{
				System.out.println(""+Entity_Chat_Messages.getMessage());
			}
			return null;
		}
		@GetMapping("/fk")
		public ModelAndView goTobblog(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws UnsupportedEncodingException
		{	
			List<Entity_GoolgeLogin_UserData>  Entity_GoolgeLogin_UserData = Service_GoogleLogin_UserData.getusers();
			for(Entity_GoolgeLogin_UserData data : Entity_GoolgeLogin_UserData)
			{
				String s = data.getEntiy_GoogleLogin().getEmail();
				System.out.println(data.getEntiy_GoogleLogin().getEmail());
			}
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("Entity_GoolgeLogin_UserData", Entity_GoolgeLogin_UserData);
	        modelAndView.setViewName("NewFile.jsp");
	        return modelAndView;
		}	
}
