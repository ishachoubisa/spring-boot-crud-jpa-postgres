package com.learn.isha.java.crud.example.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DEPARTMENT_TBL")
public class Department {

       @Id
       @GeneratedValue(strategy = GenerationType.AUTO)
       private int id;
       private String name;
       private int noOfEmployees;

       @OneToMany
       private List<Employee> employees;
}
