package student_spring_app.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping
    public Student save(@RequestBody Student student){
        return service.save(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String mail){
        return service.findByEmail(mail);
    }

    @DeleteMapping("/{email}")
    public void delete(@PathVariable String email){
        service.delete(email);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return service.update(student);
    }

    @GetMapping
    public List<Student> findAll(){
        return service.findAll();
    }
}
