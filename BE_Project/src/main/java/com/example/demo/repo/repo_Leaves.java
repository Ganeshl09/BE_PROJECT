package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Entity_Leaves;
import com.example.demo.entity.Entiy_GoogleLogin;

public interface repo_Leaves extends JpaRepository<Entity_Leaves, Integer> {
	public Entity_Leaves findByEmail(String email);
}
