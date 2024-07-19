package com.cheteen.cruddemo.dao;

import com.cheteen.cruddemo.entity.Student;

import java.util.List;

public interface IStudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    void update(Student theStudent);

    void delete(Integer id);

}