package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.entity.Employee;
import com.cap.service.AddService;


@RestController
@RequestMapping("/Emp")
@CrossOrigin("http://localhost:9098")//
public class RestControllerAdd{

	@Autowired
	private AddService empService;
	@PostMapping("/CreateAccount")
	public String createAccount(@RequestBody Employee emp) {
		return empService.createEmployee(emp);
	}
}