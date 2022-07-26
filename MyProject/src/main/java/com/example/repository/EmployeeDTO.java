package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;

@Repository
public interface EmployeeDTO extends CrudRepository<Employee, Integer>{

}
