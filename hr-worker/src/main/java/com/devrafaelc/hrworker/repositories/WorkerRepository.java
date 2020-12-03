package com.devrafaelc.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devrafaelc.hrworker.entities.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
