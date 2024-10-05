package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Entity_Leave_Request;
import com.example.demo.repo.repo_Leaves_Request;

@Service
public class Service_Leaves_Request {
	@Autowired
	private  repo_Leaves_Request repo_Leaves_Request;
	
	public Entity_Leave_Request saveRequest(Entity_Leave_Request Entity_Leave_Request)
	{
		return repo_Leaves_Request.save(Entity_Leave_Request);
	}
	
	public List<Entity_Leave_Request> getByReceiver(String  Designation,String Branch)
	{
		return repo_Leaves_Request.getByToempAndBranch(Designation, Branch);
	}
	
	public  String deleteRequest(int id)
	{
		 repo_Leaves_Request.deleteById(id);
		 return "delete request";
	}
	
	public Entity_Leave_Request getById(int id)
	{
		return repo_Leaves_Request.findById(id);
	}
	
}
