package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmployeeDAO;
import com.app.domain.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	public void save(Employee p) {
		employeeDAO.save(p);
	}

}
