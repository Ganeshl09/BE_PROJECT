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
public class Entity_Leaves {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private  int casualLeave,medicalLeave,sickLeave,earnedLeave,outdoorDuty;
	String name,email;
	
	public Entity_Leaves() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Entity_Leaves(int casualLeave, int medicalLeave, int sickLeave, int earnedLeave, int outdoorDuty,
			String name, String email) {
		super();
		this.casualLeave = casualLeave;
		this.medicalLeave = medicalLeave;
		this.sickLeave = sickLeave;
		this.earnedLeave = earnedLeave;
		this.outdoorDuty = outdoorDuty;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCasualLeave() {
		return casualLeave;
	}

	public void setCasualLeave(int casualLeave) {
		this.casualLeave = casualLeave;
	}

	public int getMedicalLeave() {
		return medicalLeave;
	}

	public void setMedicalLeave(int medicalLeave) {
		this.medicalLeave = medicalLeave;
	}

	public int getSickLeave() {
		return sickLeave;
	}

	public void setSickLeave(int sickLeave) {
		this.sickLeave = sickLeave;
	}

	public int getEarnedLeave() {
		return earnedLeave;
	}

	public void setEarnedLeave(int earnedLeave) {
		this.earnedLeave = earnedLeave;
	}

	public int getOutdoorDuty() {
		return outdoorDuty;
	}

	public void setOutdoorDuty(int outdoorDuty) {
		this.outdoorDuty = outdoorDuty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Entity_Leaves orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	 
   
}
