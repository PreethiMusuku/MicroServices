package com.cap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.EmployeeDao;
@Service
public class EmpService implements EmpServiceImpl{
	@Autowired
	private EmployeeDao empDao;

	@Override
	public String deleteEmpById(Integer eId) {
		empDao.delete(eId);
		return "deleted";
		
	}
	
	
}
