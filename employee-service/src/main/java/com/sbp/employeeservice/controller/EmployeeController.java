package com.sbp.employeeservice.controller;

import com.sbp.employeeservice.model.Employee;
import com.sbp.employeeservice.repository.EmployeeRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    EmployeeRepository repository;

    @PostMapping
    public Employee add(@RequestBody Employee employee){
        LOGGER.info("Employee add: {}", employee);
        return repository.add(employee);
    }

    @GetMapping
    public List<Employee> findAll(){
        LOGGER.info("Employee list");
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable("id") Long id){
        LOGGER.info("Employee find: id={}", id);
        return repository.findById(id);
    }

    @GetMapping("/department/{departmentId}")
    public List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId){
        LOGGER.info("Employee find: departmentId={}", departmentId );
        return repository.findByDepartment(departmentId);
    }
}
