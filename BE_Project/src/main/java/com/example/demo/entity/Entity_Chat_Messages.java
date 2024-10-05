package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Entity_Chat_Messages {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	String  message,senderemail,receiveremail,commonid;
	
	public Entity_Chat_Messages() {
		super();
	}

	public Entity_Chat_Messages(String message, String senderemail, String receiveremail, String commonid) {
		super();
		this.message = message;
		this.senderemail = senderemail;
		this.receiveremail = receiveremail;
		this.commonid = commonid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSenderemail() {
		return senderemail;
	}

	public void setSenderemail(String senderemail) {
		this.senderemail = senderemail;
	}

	public String getReceiveremail() {
		return receiveremail;
	}

	public void setReceiveremail(String receiveremail) {
		this.receiveremail = receiveremail;
	}

	public String getCommonid() {
		return commonid;
	}

	public void setCommonid(String commonid) {
		this.commonid = commonid;
	}	
}
