package com.cap.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.FetchDao;
import com.cap.entity.Employee;
@Service
public class FetchService implements FetchServiceImpl{
	@Autowired
	private FetchDao empDao;
	
	@Override
	public Employee findEmployee(Integer empId) {

		return empDao.findOne(empId);
	}

}
