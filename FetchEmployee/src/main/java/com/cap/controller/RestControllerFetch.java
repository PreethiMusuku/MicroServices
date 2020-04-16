package com.cap.controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cap.entity.Employee;
import com.cap.service.FetchService;

@RestController
@RequestMapping("/Emp")
@CrossOrigin("http://localhost:9099")//
public class RestControllerFetch {

	@Autowired
	private FetchService empService;
	@GetMapping("/findById/{empId}")
	public Employee findEmployee(@PathVariable Integer empId) {
		return empService.findEmployee(empId);
	}
		
	}

