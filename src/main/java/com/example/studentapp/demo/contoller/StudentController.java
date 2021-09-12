package com.example.studentapp.demo.contoller;

import com.example.studentapp.demo.entity.Student;
import com.example.studentapp.demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @GetMapping(value = "/api")
    public String welcome(){

        return "welcome to the spring Boot";
    }

    @GetMapping(value = "/students")
    public List<Student> getAllStudents()
    {
        return studentRepo.findAll();
    }


}
