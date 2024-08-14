package com.cheteen.cruddemo.service;

import com.cheteen.cruddemo.entity.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);



}