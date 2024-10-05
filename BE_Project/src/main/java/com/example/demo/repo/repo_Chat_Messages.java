package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Entity_Blog_AddData;
import com.example.demo.entity.Entity_Chat_Messages;

public interface repo_Chat_Messages extends JpaRepository<Entity_Chat_Messages, Integer>{
	public List<Entity_Chat_Messages> findBySenderemailAndReceiveremail(String sender, String receiver);
	List<Entity_Chat_Messages> findByCommonidOrderByIdAsc(String id);
}
