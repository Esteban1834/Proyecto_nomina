package com.utadeo.nomina.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.utadeo.nomina.model.Employee;
import com.utadeo.nomina.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    private final IEmployeeRepository employeeRepository;

    EmployeeServiceImpl(IEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee create(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public Employee update(Long id, Employee employee) {
        Employee employee2 = this.employeeRepository.findById(id).get();
        employee2.setName(employee.getName());
        return this.employeeRepository.save(employee2);
    }

    @Override
    public void delete(Long id) {
        this.employeeRepository.deleteById(id);
    }

    @Override
    public Employee findById(Long id) {
       return this.employeeRepository.findById(id).get();
    }

    @Override
    public List<Employee> findAll() {
        return this.employeeRepository.findAll();
    }

}
