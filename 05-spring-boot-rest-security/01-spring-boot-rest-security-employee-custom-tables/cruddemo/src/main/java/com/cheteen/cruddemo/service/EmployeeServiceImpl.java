package com.cheteen.cruddemo.service;

import com.cheteen.cruddemo.dao.IEmployeeDAO;
import com.cheteen.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    private IEmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(IEmployeeDAO theEmployeeDAO){
        this.employeeDAO = theEmployeeDAO;
    }

    @Override
    public List<Employee> findAll(){
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int theId) {
        return employeeDAO.findById(theId);
    }

    @Transactional
    @Override
    public Employee save(Employee theEmployee) {
        return employeeDAO.save(theEmployee);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        employeeDAO.deleteById(theId);
    }


}