package com.cheteen.demo.rest;


import com.cheteen.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents(){

        List<Student> theStudents = new ArrayList<>();

        theStudents.add(new Student("Nihat", "Çetin"));
        theStudents.add(new Student("Ömer", "Çetin"));
        theStudents.add(new Student("Fatih", "Çetin"));

        return theStudents;
    }
}