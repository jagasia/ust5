package com.ust.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.demo.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>
{

}
