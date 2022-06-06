package com.cg.spring.Rest.Spring.data.JPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.Rest.Spring.data.JPA.model.Trainee;

@Repository
public interface TraineeJpaRepository extends JpaRepository<Trainee,Integer>{




}
