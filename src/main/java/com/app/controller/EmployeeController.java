package com.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.dao.UserDAO;
import com.app.domain.Employee;
import com.app.domain.User;
import com.app.service.EmployeeService;

@Controller
public class EmployeeController {

	public EmployeeController(EmployeeService employeeService) {
		this();
		
		this.employeeService = employeeService;
		
		
	}

	public EmployeeController() {
		// TODO Auto-generated constructor stub
	}

	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UserDAO UserDAO;
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/login1", method = RequestMethod.POST)
	public @ResponseBody
	ResponseEntity<Boolean> login1(String some) {
		Employee Employee = new Employee();
		Employee.setName("sdsdfg");
		employeeService.save(Employee);
		return null;
	}

	@RequestMapping(value = "/login2", method = RequestMethod.POST)
	public @ResponseBody
	User login2(String some) {

		logger.info("Entering");
		User User = new User();
		User.setId(1);
		User.setName("sdgd");
		User.setSalary(12);
		List<User> users = UserDAO.getAllUser();
		logger.info("Exit");
		return User;
	}

}
