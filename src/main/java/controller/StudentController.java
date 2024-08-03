package controller;

import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.StudentRepository;

import java.util.List;

@RestController
@RequestMapping("Student")



public class StudentController {
    @Autowired
    StudentRepository studentRepository;
    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


}
