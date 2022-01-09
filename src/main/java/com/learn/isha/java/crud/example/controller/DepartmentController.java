package com.learn.isha.java.crud.example.controller;


import com.learn.isha.java.crud.example.entity.Department;
import com.learn.isha.java.crud.example.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @PostMapping("/addDepartment")
    public Department addDepartment(@RequestBody Department department) {
        return service.saveDepartment(department);
    }

    @PostMapping("/addDepartments")
    public List<Department> addDepartments(@RequestBody List<Department> departments) {
        return service.saveDepartments(departments);
    }

    @GetMapping("/findAllDepartments")
    public List<Department> findAllDepartments() {
        return service.getDepartments();
    }

    @GetMapping("/findDepartment/{id}")
    public Department findDepartmentsById(@PathVariable int id) {
        return service.getDepartmentById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable int id) {
        return service.deleteDepartmentById(id);
    }

    @DeleteMapping("/deleteAllDepartments")
    public void deleteAllDepartments() {
        service.deleteAll();
    }

    @PutMapping("/updateDepartment")
    public Department updateDepartment(@RequestBody Department department) {
        return service.updateDepartment(department);
    }
}
