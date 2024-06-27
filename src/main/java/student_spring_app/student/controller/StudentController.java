package student_spring_app.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import student_spring_app.student.model.Student;
import student_spring_app.student.service.StudentService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    final private StudentService service;

    public StudentController(StudentService service){
        this.service = service;
    }

    @GetMapping
    public List<Student> findAll(){
        return service.findAll();
    }
}
