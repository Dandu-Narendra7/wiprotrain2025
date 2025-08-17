package com.wipro.employee.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.employee.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
	    Optional<Department> findByName(String name);

}
