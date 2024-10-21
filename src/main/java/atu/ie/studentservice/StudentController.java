package atu.ie.studentservice;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping(("/students"))
public class StudentController {
    private List<Student> student = new ArrayList<>();
    private StudentService studentService;
    private Communication communication;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @GetMapping("/getDetails")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @PostMapping("/postDetails")
    public Student addstudent(@RequestBody Student student){
        return studentService.addstudent(student);
    }
    @PostMapping("/confirm")
    public String GetDetailsfromfirstStudent(@RequestBody Student student){
        return communication.somedetails(student);
    }
}
