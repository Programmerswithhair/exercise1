package com.qy28.sm.controller;


import com.qy28.sm.entity.Employee;
import com.qy28.sm.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("{id}")
    public Employee findById(@PathVariable Long id){
          return employeeService.findById(id);
    }

    @PostMapping
    public int addEmployee(@RequestBody Employee employee){
          return employeeService.addEmployee(employee);
    }

    @PutMapping
    public int updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("{id}")
    public int deleleEmployee(@PathVariable Long id){
        return employeeService.deleteEmployee(id);
    }
}
