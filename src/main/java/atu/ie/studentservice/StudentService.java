package atu.ie.studentservice;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class StudentService {
    private List<Student> StudentList = new ArrayList<>();
    public List<Student> getAllStudent(){
        return StudentList;
    }
    public Student addstudent(Student student){
        StudentList.add(student);
        return student;
    }

}
