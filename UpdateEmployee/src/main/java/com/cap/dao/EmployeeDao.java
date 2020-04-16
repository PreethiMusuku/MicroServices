package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {


	
}
