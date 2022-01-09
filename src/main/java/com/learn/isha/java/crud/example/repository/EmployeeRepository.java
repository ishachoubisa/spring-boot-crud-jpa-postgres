package com.learn.isha.java.crud.example.repository;

import com.learn.isha.java.crud.example.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
