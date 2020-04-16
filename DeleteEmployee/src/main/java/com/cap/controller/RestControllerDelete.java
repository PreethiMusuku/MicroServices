package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.service.EmpService;

@RestController
@RequestMapping("/Emp")
@CrossOrigin("http://localhost:8181")//
public class RestControllerDelete {
	@Autowired
	private EmpService empService;

	@DeleteMapping("/deleteEmp/{empId}")
	public String deleteEmp(@PathVariable Integer empId) {
		return empService.deleteEmpById(empId);
		
	
}
	}
