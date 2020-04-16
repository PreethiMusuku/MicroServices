package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cap.entity.Employee;
import com.cap.service.EmpService;
@RestController

public class RestControllerUpdate {
	@Autowired
	private EmpService empService;
	@Autowired
	RestTemplate rest;
	
	@RequestMapping("/update/Employee")
	public String updateEmp(@RequestBody Employee emp) {
		Employee e=rest.getForObject("http://localhost:9099/Emp/findById/"+emp.getEid(),Employee.class);
		if(e!=null)
		{
			e.setEname(emp.getEname());
			e.setEsal(emp.getEsal());
			empService.updateEmployee(e);
			return "employee updated";
			
		}
		else {
		return "emp does not exist"+emp.getEid();
	}
}
}
