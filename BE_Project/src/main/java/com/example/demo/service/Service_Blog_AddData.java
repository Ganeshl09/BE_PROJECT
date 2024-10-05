package com.example.demo.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.Entity_Blog_AddData;
import com.example.demo.repo.repo_Blog_AddData;



@Service
public class Service_Blog_AddData {
	@Autowired
	private repo_Blog_AddData repo_Blog_AddData;
	
	public List<Entity_Blog_AddData> getBlogs()
	{
		return repo_Blog_AddData.findAll();
	}
	public Entity_Blog_AddData save (Entity_Blog_AddData  savedata)
	{
		 return repo_Blog_AddData.save(savedata);
	}
	public Entity_Blog_AddData getById (int id)
	{
		System.out.println(id);
		System.out.println(repo_Blog_AddData.findById(id).getName());
		return repo_Blog_AddData.findById(id);
	}
	public List<Entity_Blog_AddData>getByDesignation(String designation)
	{
		return repo_Blog_AddData.findByDesignation(designation);
	}
	public List<Entity_Blog_AddData>getByName(String name)
	{
		return repo_Blog_AddData.findByName(name);
	}
	public String deleteUser(int id)
	{
		repo_Blog_AddData.deleteById(id);
		return "product deleted"; 
	}
	
	public void uploadFile(MultipartFile file) throws IllegalStateException, IOException
	{
		file.transferTo( new File("C:\\Users\\Gaurav\\eclipse-workspace\\BE_Project\\src\\main\\resources\\static\\uploads\\"+file.getOriginalFilename() ));
	}

}
