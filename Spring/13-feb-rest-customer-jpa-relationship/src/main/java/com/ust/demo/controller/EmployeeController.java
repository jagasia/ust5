package com.ust.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.demo.entity.Employee;
import com.ust.demo.service.EmployeeNotFoundException;
import com.ust.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService ds;
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Employee employee) {
		Employee response = ds.create(employee);
		ResponseEntity<?> responseEntity=null;
		if(response!=null)
		{
			responseEntity=new ResponseEntity<>(response, HttpStatus.OK);
		}
		else
		{
			responseEntity=new ResponseEntity<>("Adding Employee Failed!", HttpStatus.NOT_ACCEPTABLE);
		}
		return responseEntity;
	}
	
	@GetMapping
	public ResponseEntity<List<Employee>> read() {
		List<Employee> employees = ds.read();
		return new ResponseEntity<>(employees, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable("id") Integer id) {
		Optional<Employee> emp = ds.read(id);
		ResponseEntity<?> responseEntity=null;
		if(emp.isPresent())
		{
			responseEntity=new ResponseEntity<>(emp.get(),HttpStatus.OK);
		}else
		{
			responseEntity=new ResponseEntity<>("Adding Employee Failed!", HttpStatus.NOT_ACCEPTABLE);
		}
		return responseEntity;
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody Employee employee) {
		Employee temp=null;
		ResponseEntity<?> responseEntity=null;
		try {
			temp=ds.update(employee);
			responseEntity=new ResponseEntity<>(temp,HttpStatus.OK);
		} catch (EmployeeNotFoundException e) {
			responseEntity=new ResponseEntity<>("Updating Employee Failed!", HttpStatus.NOT_ACCEPTABLE);
		}
		return responseEntity;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
		Employee temp=null;
		ResponseEntity<?> responseEntity=null;
		try {
			ds.delete(id);
			responseEntity=new ResponseEntity<>(id,HttpStatus.OK);
		} catch (EmployeeNotFoundException e) {
			responseEntity=new ResponseEntity<>("Deleting Employee Failed!", HttpStatus.NOT_ACCEPTABLE);
		}
		return responseEntity;
	}
	
}
