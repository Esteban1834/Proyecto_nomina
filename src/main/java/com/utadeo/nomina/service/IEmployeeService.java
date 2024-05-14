package com.utadeo.nomina.service;

import java.util.List;

import com.utadeo.nomina.model.Employee;

public interface IEmployeeService {
    Employee create(Employee employee);

    Employee update(Long id, Employee employee);

    void delete(Long id);

    Employee findById(Long id);

    List<Employee> findAll();
}
