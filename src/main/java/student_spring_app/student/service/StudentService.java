package student_spring_app.student.service;

import org.springframework.stereotype.Service;
import student_spring_app.student.model.Student;

import java.time.LocalDate;
import java.util.List;


public interface StudentService {

    Student save(Student s);

    List<Student> findAll();

    Student findByEmail(String email);

    Student update(Student s);

    void delete(String email);
}
