package com.example.demo.service;

import java.text.BreakIterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Entiy_GoogleLogin;
import com.example.demo.repo.repo_GoogleLogin;

@Service
public class Service_GoogleLogin {
	@Autowired
	private repo_GoogleLogin repo;
	
	public Entiy_GoogleLogin save(Entiy_GoogleLogin login)
	{
		 return repo.save(login);
	}
	public List<Entiy_GoogleLogin> save(List<Entiy_GoogleLogin> users)
	{
		return repo.saveAll(users);
	}
	public List<Entiy_GoogleLogin> getusers()
	{
		return repo.findAll();
	}
	public List<Entiy_GoogleLogin> getusersByAisc()
	{
		return repo.findAllByOrderByIdDesc();
	}
	public Entiy_GoogleLogin getUserById(int id)
	{
		return repo.findById(id).orElse(null);
	}
	public Entiy_GoogleLogin getUserByUserId(int id)
	{
		if(repo.findByuserid(id)!=null){
			return repo.findByuserid(id);
		}
		return null;
	}
    /*public List<Entiy_GoogleLogin> getUserByEmail(String email)
	{
		if(repo.findByEmail(email)!=null){
			System.out.println("Valid user "+repo.findByEmail(email));
			return repo.findByEmail(email);
		}
		System.out.println("InValid user "+repo.findByEmail(email));
		return repo.findByEmail(email);
	}*/
	public List<Entiy_GoogleLogin> getUserByEmailID(String email)
	{
	
		if(repo.findByEmail(email)!=null){
			System.out.println("----------Valid user "+repo.findByEmail(email));
			return repo.findByEmail(email);
		}
		else {
			System.out.println("----------inValid user "+repo.findByEmail(email));
			return repo.findByEmail(email);
		}
	}

	
	public String deleteUser(int id)
	{
		repo.deleteById(id);
		return "product deleted"; 
	}
	public Entiy_GoogleLogin UpdateUser(Entiy_GoogleLogin user)
	{
		Entiy_GoogleLogin exits = repo.findById(user.getUserid()).orElse(null); 
		exits.setEmail(user.getEmail());
		return repo.save(exits);
	}
} 
