package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.EmployeeService;

@RestController
public class Controller {
	
	@Autowired
	private EmployeeService es;
	
	@RequestMapping(path="/feedEmployeeData")
	public void setDataInDB() {
		es.saveEmployeeData();
	}
}
