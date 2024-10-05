package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Entiy_GoogleLogin;



public interface repo_GoogleLogin extends JpaRepository<Entiy_GoogleLogin, Integer> {
	//Entiy_GoogleLogin findByEmail_(String email);
	public List<Entiy_GoogleLogin> findByEmail(String email);
	Entiy_GoogleLogin  findByuserid(int id);	
    public List<Entiy_GoogleLogin> findAllByOrderByIdDesc();
}
