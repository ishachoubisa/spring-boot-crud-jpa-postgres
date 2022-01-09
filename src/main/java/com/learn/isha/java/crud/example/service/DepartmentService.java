package com.learn.isha.java.crud.example.service;


import com.learn.isha.java.crud.example.entity.Department;
import com.learn.isha.java.crud.example.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public Department saveDepartment(Department department){
       return repository.save(department);
    }

    public List<Department> saveDepartments(List<Department> departments){
        return repository.saveAll(departments);
    }

    public List<Department> getDepartments(){
        return repository.findAll();
    }

    public Department getDepartmentById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteDepartmentById(int id){
         repository.deleteById(id);
        return "Department deleted" +id;
    }

    public Department updateDepartment(Department department){
        Department existingDepartment = repository.findById(department.getId()).orElse(null);
        existingDepartment.setId(department.getId());
        existingDepartment.setName(department.getName());
        existingDepartment.setNoOfEmployees(department.getNoOfEmployees());
        return repository.save(existingDepartment);
    }

    public void deleteAll(){
        repository.deleteAll();
    }

}
