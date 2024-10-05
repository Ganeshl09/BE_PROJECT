package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Entity_GoolgeLogin_UserData;
import com.example.demo.repo.repo_GoogleLogin_UserData;
import com.example.demo.security.AES_Algorithm;

@Service
public class Service_GoogleLogin_UserData {
	@Autowired
	private repo_GoogleLogin_UserData repo;
	
	public List<Entity_GoolgeLogin_UserData> getusers()
	{
		return repo.findAll();
	}
	public Entity_GoolgeLogin_UserData save (Entity_GoolgeLogin_UserData  savedata)
	{
		 return repo.save(savedata);
	}
	
	public Entity_GoolgeLogin_UserData getUserById(int id)
	{
		return repo.findById(id);
	}
	
	public List<Entity_GoolgeLogin_UserData> getUserByEmail(String email)
	{
		System.out.println("------------get by mail : "+email);
		if(repo.findByEmail(email)!=null){
			System.out.println("------------get by mail data : "+repo.findByEmail(email).toString());
			return repo.findByEmail(email);
		}
		else {
			 return repo.findByEmail(email);
		}
	}
	public List<Entity_GoolgeLogin_UserData> getUserByName(String name)
	{
			System.out.println( repo.findByName(name));
			return repo.findByName(name);
	}
	

}
