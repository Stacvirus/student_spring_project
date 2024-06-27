package student_spring_app.student.repository;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import student_spring_app.student.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDao {
    private final List<Student> students = new ArrayList<>();

    public Student save(Student s) {
        this.students.add(s);
        return s;
    }

    public List<Student> findAll() {
        return this.students;
    }

    public Student findByEmail(String email) {
        return students.stream()
                .filter(s -> email.equals(s.getEmail()))
                .findFirst()
                .orElse(null);
    }

    public Student update(Student s) {
        var studentIndex = IntStream.range(0, students.size())
                .filter(index -> students.get(index).getEmail().equals(s.getEmail()))
                .findFirst()
                .orElse(-1);
        if(studentIndex > -1){
            students.set(studentIndex, s);
            return s;
        }
        return null;
    }

    public void delete(String email) {
        var s = findByEmail(email);
        if(s != null){
            students.remove(s);
        }
    }

}
