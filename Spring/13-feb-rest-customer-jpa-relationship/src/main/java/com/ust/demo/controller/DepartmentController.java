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

import com.ust.demo.entity.Department;
import com.ust.demo.service.DepartmentNotFoundException;
import com.ust.demo.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	private DepartmentService ds;
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Department department) {
		Department response = ds.create(department);
		ResponseEntity<?> responseEntity=null;
		if(response!=null)
		{
			responseEntity=new ResponseEntity<>(response, HttpStatus.OK);
		}
		else
		{
			responseEntity=new ResponseEntity<>("Adding Department Failed!", HttpStatus.NOT_ACCEPTABLE);
		}
		return responseEntity;
	}
	
	@GetMapping
	public ResponseEntity<List<Department>> read() {
		List<Department> departments = ds.read();
		return new ResponseEntity<>(departments, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable("id") Integer id) {
		Optional<Department> dept = ds.read(id);
		ResponseEntity<?> responseEntity=null;
		if(dept.isPresent())
		{
			responseEntity=new ResponseEntity<>(dept.get(),HttpStatus.OK);
		}else
		{
			responseEntity=new ResponseEntity<>("Adding Department Failed!", HttpStatus.NOT_ACCEPTABLE);
		}
		return responseEntity;
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody Department department) {
		Department temp=null;
		ResponseEntity<?> responseEntity=null;
		try {
			temp=ds.update(department);
			responseEntity=new ResponseEntity<>(temp,HttpStatus.OK);
		} catch (DepartmentNotFoundException e) {
			responseEntity=new ResponseEntity<>("Updating Department Failed!", HttpStatus.NOT_ACCEPTABLE);
		}
		return responseEntity;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
		Department temp=null;
		ResponseEntity<?> responseEntity=null;
		try {
			ds.delete(id);
			responseEntity=new ResponseEntity<>(id,HttpStatus.OK);
		} catch (DepartmentNotFoundException e) {
			responseEntity=new ResponseEntity<>("Deleting Department Failed!", HttpStatus.NOT_ACCEPTABLE);
		}
		return responseEntity;
	}
	
}
