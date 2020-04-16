package com.cap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.AddDao;
import com.cap.entity.Employee;

@Service
public class AddService implements AddServiceImpl{

		@Autowired
		private AddDao empDao;
		@Override
		public String createEmployee(Employee emp) {
			empDao.save(emp);
			return "Employee Registered with !!! .." ;
		}
}