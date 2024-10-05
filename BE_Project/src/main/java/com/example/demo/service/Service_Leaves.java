package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Entity_Leaves;
import com.example.demo.repo.repo_Leaves;

@Service
public class Service_Leaves {
	@Autowired
	private repo_Leaves repo_Leaves;
	
	public Entity_Leaves setLeaves(Entity_Leaves entity_Leaves)
	{
		return repo_Leaves.save(entity_Leaves);
	}
	
	public List<Entity_Leaves> getLeaves()
	{
		return repo_Leaves.findAll();
	}
	
	public Entity_Leaves getByEmail(String email)
	{
		return repo_Leaves.findByEmail(email);
	}
	public Entity_Leaves UpdateUser(Entity_Leaves Entity_Leaves)
	{
		Entity_Leaves user = repo_Leaves.findByEmail(Entity_Leaves.getEmail()); 
		user.setEarnedLeave(Entity_Leaves.getEarnedLeave());
		return repo_Leaves.save(user);
	}
}
