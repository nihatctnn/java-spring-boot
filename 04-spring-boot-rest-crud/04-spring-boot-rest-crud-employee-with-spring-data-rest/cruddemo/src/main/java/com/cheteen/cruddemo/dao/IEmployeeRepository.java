package com.cheteen.cruddemo.dao;

import com.cheteen.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path="members")
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
}