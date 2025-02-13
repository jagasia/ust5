package com.ust.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.demo.entity.Employee;
import com.ust.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository er;
	
	public Employee create(Employee employee) {
		return er.save(employee);
	}
	public List<Employee> read() {
		return er.findAll();
	}
	public Optional<Employee> read(Integer id) {
		return er.findById(id);
	}
	public Employee update(Employee employee) throws EmployeeNotFoundException {
		Optional<Employee> temp = read(employee.getId());
		if(temp.isPresent()) {
			return er.save(employee);
		}else
		{
			throw new EmployeeNotFoundException(employee.getId()+" is not found to update! Are you trying to add? then use POST");
		}
	}
	public void delete(Integer id) throws EmployeeNotFoundException {
		Optional<Employee> temp = read(id);
		if(temp.isPresent()) {
			er.deleteById(id);
		}
		else
			throw new EmployeeNotFoundException(id+" is not found to update! Are you trying to add? then use POST");
		}
	}
	

