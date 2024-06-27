package student_spring_app.student.service;

import org.springframework.stereotype.Service;
import student_spring_app.student.model.Student;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAll(){
        return List.of(
                new Student("stac",
                        "virus",
                        LocalDate.now(),
                        "stacvirus@gmail.com",
                        22),
                new Student("Thema",
                        "Lomberge",
                        LocalDate.now(),
                        "Thema@gmail.com",
                        20)
        );
    }
}
