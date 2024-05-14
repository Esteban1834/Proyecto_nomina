package com.utadeo.nomina.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.utadeo.nomina.model.Employee;
import com.utadeo.nomina.service.IEmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class EmployeeController {
    private final IEmployeeService employeeService;

    public EmployeeController(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employee")
    public Employee create(@RequestBody Employee employee) {
        return this.employeeService.create(employee);
    }

    @GetMapping("/employee/{id}")
    public Employee get(@PathVariable("id") Long id) {
        return this.employeeService.findById(id);
    }
    
    
}
