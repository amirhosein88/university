package com.example.springdbconfig.Controller;


import com.example.springdbconfig.Model.Response;
import com.example.springdbconfig.Model.Student;
import com.example.springdbconfig.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired StudentRepository studentRepository;

    @PostMapping("/Addstudent")
    public Response AddStudent(@RequestBody Student student){
        studentRepository.save(student);
        return new Response("ok");
    }

}
