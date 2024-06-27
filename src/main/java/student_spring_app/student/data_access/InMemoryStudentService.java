package student_spring_app.student.data_access;

import org.springframework.stereotype.Service;
import student_spring_app.student.model.Student;
import student_spring_app.student.repository.InMemoryStudentDao;
import student_spring_app.student.service.StudentService;

import java.time.LocalDate;
import java.util.List;

@Service
public class InMemoryStudentService implements StudentService {

    private final InMemoryStudentDao dao;

    public InMemoryStudentService(InMemoryStudentDao dao){
        this.dao = dao;
    }

    @Override
    public Student save(Student s) {
        return dao.save(s);
    }

    @Override
    public List<Student> findAll() {
        return dao.findAll();
    }

    @Override
    public Student findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return dao.update(s);
    }

    @Override
    public void delete(String email) {
        dao.delete(email);
    }
}
