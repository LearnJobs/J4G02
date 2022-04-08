package com.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.model.Employee;

public interface Employee_Repository extends JpaRepository<Employee, Long> {
	  List<Employee> findByPublished(boolean published);

	  List<Employee> findByTitleContaining(String title);

}
