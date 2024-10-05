package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Entity_Chat_Messages;
import com.example.demo.entity.Entity_GoolgeLogin_UserData;
import com.example.demo.entity.Entiy_GoogleLogin;
import com.example.demo.repo.repo_Chat_Messages;

@Service
public class Service_Chat_Messages {
	@Autowired
	private repo_Chat_Messages repo_Chat_Messages;
	
	public Entity_Chat_Messages save(Entity_Chat_Messages msg)
	{
		 return repo_Chat_Messages.save(msg);
	}
	public List<Entity_Chat_Messages> getMessages()
	{
		return repo_Chat_Messages.findAll();
	}
	
	public List<Entity_Chat_Messages> getMessagesBetweenUser(String sender,String receiver )
	{
		return repo_Chat_Messages.findBySenderemailAndReceiveremail(sender, receiver);
	}
	
	public List<Entity_Chat_Messages> getCommonId(String id)
	{
			return repo_Chat_Messages.findByCommonidOrderByIdAsc(id);
	}
}
