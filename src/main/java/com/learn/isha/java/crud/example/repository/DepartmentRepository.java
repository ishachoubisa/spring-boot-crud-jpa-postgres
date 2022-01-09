package com.learn.isha.java.crud.example.repository;

import com.learn.isha.java.crud.example.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {


}
