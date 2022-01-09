package com.learn.isha.java.crud.example.service;

import com.learn.isha.java.crud.example.entity.Employee;
import com.learn.isha.java.crud.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> saveEmployees(List<Employee> employees) {
        return repository.saveAll(employees);
    }

    public Employee getEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public String deleteEmployeeById(int id) {
        repository.deleteById(id);
        return "Employee deleted" + id;
    }


    public Employee updateEmployee(Employee employee) {
        Employee existingEmployee = repository.findById(employee.getId()).orElse(null);
        existingEmployee.setName(employee.getName());
        existingEmployee.setAddress(employee.getAddress());
        existingEmployee.setSalary(employee.getSalary());
        return repository.save(existingEmployee);
    }

    public void deleteAll(){
     repository.deleteAll();
    }
}
