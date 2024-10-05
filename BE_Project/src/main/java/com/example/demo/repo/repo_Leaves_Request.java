package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Entity_Blog_AddData;
import com.example.demo.entity.Entity_Leave_Request;

public interface repo_Leaves_Request extends JpaRepository<Entity_Leave_Request, Integer> {
	List<Entity_Leave_Request> getByToempAndBranch(String designatio,String branch);
	public Entity_Leave_Request findById(int  id);
}
