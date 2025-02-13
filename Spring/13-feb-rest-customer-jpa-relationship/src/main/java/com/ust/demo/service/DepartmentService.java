package com.ust.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.demo.entity.Department;
import com.ust.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository dr;
	
	public Department create(Department department) {
		return dr.save(department);
	}
	public List<Department> read() {
		return dr.findAll();
	}
	public Optional<Department> read(Integer id) {
		return dr.findById(id);
	}
	public Department update(Department department) throws DepartmentNotFoundException {
		Optional<Department> temp = read(department.getId());
		if(temp.isPresent()) {
			return dr.save(department);
		}else
		{
			throw new DepartmentNotFoundException(department.getId()+" is not found to update! Are you trying to add? then use POST");
		}
	}
	public void delete(Integer id) throws DepartmentNotFoundException {
		Optional<Department> temp = read(id);
		if(temp.isPresent()) {
			dr.deleteById(id);
		}
		else
			throw new DepartmentNotFoundException(id+" is not found to update! Are you trying to add? then use POST");
		}
	}
	

