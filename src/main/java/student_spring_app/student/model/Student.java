package student_spring_app.student.model;

import java.time.LocalDate;
import lombok.Data;

@Data
public class Student {
    private String firstname;
    private String lastname;
    private LocalDate date;
    private String email;
    private int age;

    public Student(String firstname, String lastname, LocalDate date, String email, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.date = date;
        this.email = email;
        this.age = age;
    }
}
