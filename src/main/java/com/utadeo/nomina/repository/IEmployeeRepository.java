package com.utadeo.nomina.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utadeo.nomina.model.Employee;

// uno por cada clase
public interface IEmployeeRepository extends JpaRepository<Employee, Long>{
}
