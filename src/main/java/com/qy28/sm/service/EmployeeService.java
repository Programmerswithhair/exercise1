package com.qy28.sm.service;

import com.qy28.sm.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(Long id);

    int addEmployee(Employee employee);

    int updateEmployee(Employee employee);

    int deleteEmployee(Long id);
}
