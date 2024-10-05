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
public class Entity_Leave_Request {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	String dateFrom,dateTo,toemp,fromemp,branch,image,reason,status,type,name,email;
	int nod;
	
	public Entity_Leave_Request() {
		super();
		// TODO Auto-generated constructor stub
	}
  

	public Entity_Leave_Request(String dateFrom, String dateTo, String toemp, String fromemp, String branch,
			String image, String reason, String status, String type, String name, int nod,String email) {
		super();
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.toemp = toemp;
		this.fromemp = fromemp;
		this.branch = branch;
		this.image = image;
		this.reason = reason;
		this.status = status;
		this.type = type;
		this.name = name;
		this.nod = nod;
		this.email=email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	public String getDateTo() {
		return dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	public String getToemp() {
		return toemp;
	}

	public void setToemp(String toemp) {
		this.toemp = toemp;
	}

	public String getFromemp() {
		return fromemp;
	}

	public void setFromemp(String fromemp) {
		this.fromemp = fromemp;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNod() {
		return nod;
	}


	public void setNod(int nod) {
		this.nod = nod;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Entity_Leave_Request [id=" + id + ", dateFrom=" + dateFrom + ", dateTo=" + dateTo + ", toemp=" + toemp
				+ ", fromemp=" + fromemp + ", branch=" + branch + ", image=" + image + ", reason=" + reason
				+ ", status=" + status + ", type=" + type + ", name=" + name + ", nod=" + nod + ", email=" + email
				+ "]";
	}

   
	
	
	
}
