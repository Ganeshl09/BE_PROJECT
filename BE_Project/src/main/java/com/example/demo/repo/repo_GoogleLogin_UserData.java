package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Entity_GoolgeLogin_UserData;

public interface repo_GoogleLogin_UserData extends JpaRepository<Entity_GoolgeLogin_UserData, Integer> {
	public List<Entity_GoolgeLogin_UserData> findByEmail(String email);
	public List<Entity_GoolgeLogin_UserData> findByName(String name);
	Entity_GoolgeLogin_UserData findById(int  id);
}
