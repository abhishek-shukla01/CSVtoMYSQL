package com.example.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeDTO;

@Service
public class EmployeeService {
		@Autowired
		private EmployeeDTO edto;

		String line = "";
		public void saveEmployeeData() {
			try {
				BufferedReader br=new BufferedReader(new FileReader("src/main/resources/EmployeeDataFile.csv"));
				while((line=br.readLine())!=null) {
					String [] data=line.split(",");
					Employee e = new Employee();
					e.setName(data[0]);
					e.setDepartment(data[1]);
					e.setSalary(data[2]);
					e.setAddress(data[3]);
					edto.save(e);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
