package com.cg.spring.Rest.Spring.data.JPA.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.Rest.Spring.data.JPA.model.Trainee;
import com.cg.spring.Rest.Spring.data.JPA.service.TraineeService;

@RestController
public class TraineeController {
	@Autowired
	private TraineeService traineeService;
	
	//http://localhost:8082/hello
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hello world!");
		return "Hello Sridhar!";
	}
	
	//http://localhost:8082/alltrainee
	@GetMapping("/alltrainee")
	public List<Trainee> getAllTrainee(){
		List<Trainee> traineeList = new ArrayList<>();
		traineeList.add(new Trainee(101,"Sridhar","Developer","Nellore"));
		traineeList.add(new Trainee(102,"Vishnu","CA","Venkatagiri"));
		System.out.println("List of All Trainees");
		return traineeList;
	}
	
	//http://localhost:8082/listbyname/{traineeName}
	@GetMapping("/listbyname/{traineeName}")
	public Trainee getTraineeByName(@PathVariable(name="traineeName") String trainee_Name) {
		System.out.println("List Trainee by Name");
		return traineeService.getTraineeByColumn(trainee_Name);
	}
	
	//http://localhost:8082/listbyId/{traineeId}
	@GetMapping("/listbyId/{traineeId}")
	public Trainee getTraineeByColumn(@PathVariable(name = "traineeId")int trainee_Id) {
		System.out.println("List Trainee by Id");
		return traineeService.getTraineeById(trainee_Id);
	}
	
	//http://localhost:8082/deltrainee/{traineeId}
	@DeleteMapping("/deltrainee/{traineeId}")
	public Trainee deleteTraineeById(@PathVariable int trainee_Id) {
		System.out.println("Delete Trainee by Id");
		return traineeService.deleteTraineeById(trainee_Id);
	}
	
	//http://localhost:8082/updatetrainee/{traineeId}
	@PutMapping("/updatetrainee/{traineeId}")
	public Trainee updateTraineeById(@RequestBody Trainee trainee ) {
		System.out.println("Update Trainee by Id");
		return trainee;
	}
	
	//http://localhost:8082/addtrainee
	@PostMapping("/addtrainee")
	public Trainee insertTrainee(@RequestBody Trainee trainee) {
		System.out.println("Add new Trainee");
		return traineeService.addTrainee(trainee);
	}
	
}



