package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Entity_Chat_Users {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	String  senderemail,email,img_url,name;
	
	
	public Entity_Chat_Users() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Entity_Chat_Users(String senderemail, String email, String img_url, String name) {
		super();
		this.senderemail = senderemail;
		this.email = email;
		this.img_url = img_url;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSenderemail() {
		return senderemail;
	}


	public void setSenderemail(String senderemail) {
		this.senderemail = senderemail;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getImg_url() {
		return img_url;
	}


	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
