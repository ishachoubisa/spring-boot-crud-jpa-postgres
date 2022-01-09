package com.learn.isha.java.crud.example.controller;

import com.learn.isha.java.crud.example.entity.Employee;
import com.learn.isha.java.crud.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return service.saveEmployee(employee);
    }

    @PostMapping("/addEmployees")
    public List<Employee> addEmployees(@RequestBody List<Employee> employees) {
        return service.saveEmployees(employees);
    }

    @GetMapping("/getEmployee/{id}")
    public Employee getEmployee (@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @GetMapping("/getEmployees")
    public List<Employee> getEmployees () {
        return service.getAllEmployees();
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployeeById(@PathVariable int id) {
        service.deleteEmployeeById(id);
        return String.format("Employee with id %d is deleted", id);
    }

    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return service.updateEmployee(employee);
    }

    @DeleteMapping("/deleteEmployees")
    public void deleteEmployees() {
     service.deleteAll();
    }


}
