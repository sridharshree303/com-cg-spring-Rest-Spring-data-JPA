package com.cg.spring.Rest.Spring.data.JPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.Rest.Spring.data.JPA.model.Trainee;
import com.cg.spring.Rest.Spring.data.JPA.repository.TraineeJpaRepository;

@Service
public class TraineeService {
	
	@Autowired
	private TraineeJpaRepository traineeRepository;

	public List<Trainee> getAllTrainee() {
		System.out.println("Service getAllTrainees");
		return traineeRepository.findAll();
	}
	
//	public Trainee getTraineeByName(String traineeName) {
//		System.out.println("Service get Trainee Id by Name");
//		return traineeRepository.getById(traineeName);
//	}

	public Trainee getTraineeById(int traineeId) {
		System.out.println("Service get Trainee by Id");
		return traineeRepository.findById(traineeId).get();
	}

//	public Trainee deleteTraineeById(int traineeId) {
//		traineeRepository.deleteById( traineeId);
//		return deleteTraineeById(traineeId);
//	}
	
	public Trainee updateTrainee(Trainee trainee) {
		System.out.println("Update Trainee");
		return traineeRepository.save(trainee);
	}

	public Trainee addTrainee(Trainee trainee) {
		System.out.println("Insert new Trainee");
		return traineeRepository.save(trainee);
	}

	public Trainee deleteTraineeById(int traineeId) {
		Trainee tra = traineeRepository.getOne(traineeId);
		traineeRepository.delete(tra);
		return tra;
	}

	public Trainee getTraineeByColumn(String traineeName) {
		
		return null;
	}

	

}
