package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Entity_Blog_AddData;
import com.example.demo.entity.Entity_GoolgeLogin_UserData;
public interface repo_Blog_AddData extends JpaRepository<Entity_Blog_AddData, Integer>{
	Entity_Blog_AddData findById(int  id);
	public List<Entity_Blog_AddData> findByDesignation(String designation);
	public List<Entity_Blog_AddData> findByName(String name);
}
