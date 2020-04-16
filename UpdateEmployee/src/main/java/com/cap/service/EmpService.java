package com.cap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.EmployeeDao;
import com.cap.entity.Employee;
@Service
public class EmpService implements EmpServiceImpl{
	@Autowired
	private EmployeeDao empDao;
	@Override
	public String updateEmployee(Employee emp) {
	empDao.save(emp);
	return "updated";
	
		
	}

}
