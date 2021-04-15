package com.qy28.sm.service.impl;

import com.qy28.sm.entity.Employee;
import com.qy28.sm.mapper.EmployeeMapper;
import com.qy28.sm.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    final EmployeeMapper employeeMapper;

    @Override
    public List<Employee> findAll() {
        return employeeMapper.findAll();
    }

    @Override
    public Employee findById(Long id) {
        return employeeMapper.findById(id);
    }

    @Override
    public int addEmployee(Employee employee) {
        return employeeMapper.addEmployee(employee);
    }

    @Override
    public int updateEmployee(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }

    @Override
    public int deleteEmployee(Long id) {
        return employeeMapper.deleteEmployee(id);
    }
}
