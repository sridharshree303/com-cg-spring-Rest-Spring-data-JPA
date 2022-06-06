package com.cg.spring.Rest.Spring.data.JPA.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="Trainee_table")
public class Trainee {
	
	@Id   // primary key so we need to mention
	int trainee_Id;
	@Column
	String trainee_Name;
	@Column   // no need to mention 
	String trainee_Domain;
	@Column
	String trainee_Location;
	
	public Trainee() {
		super();
	}
	
	public Trainee(int trainee_Id,String trainee_Name,String trainee_Domain,String trainee_Location) {
		super();
		this.trainee_Id = trainee_Id;
		this.trainee_Name = trainee_Name;
		this.trainee_Domain = trainee_Domain;
		this.trainee_Location = trainee_Domain;
	}

	public int getTrainee_Id() {
		return trainee_Id;
	}

	public void setTraineeId(int trainee_Id) {
		this.trainee_Id = trainee_Id;
	}

	public String getTraineeName() {
		return trainee_Name;
	}

	public void setTrainee_Name(String trainee_Name) {
		this.trainee_Name = trainee_Name;
	}

	public String getTrainee_Domain() {
		return trainee_Domain;
	}

	public void setTrainee_Domain(String trainee_Domain) {
		this.trainee_Domain = trainee_Domain;
	}

	public String getTrainee_Location() {
		return trainee_Location;
	}

	public void setTrainee_Location(String trainee_Location) {
		this.trainee_Location = trainee_Location;
	}
	@Override
	public String toString() {
		
		return "Trainee [ TraineeId = "+trainee_Id+" TraineeName = "+
				trainee_Name+" TraineeDomain = "+trainee_Domain+""
						+ " TraineeLocation = "+trainee_Location+" ] ";
	}
	
}
