package com.cheteen.cruddemo.dao;

import com.cheteen.cruddemo.entity.Employee;

import java.util.List;

public interface IEmployeeDAO {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}