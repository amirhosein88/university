package com.example.springdbconfig.Controller;


import com.example.springdbconfig.Model.Course;
import com.example.springdbconfig.Model.Professor;
import com.example.springdbconfig.Model.Response;
import com.example.springdbconfig.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @PostMapping("/Addcourse")
    public Response AddCourse(Course course){
        courseRepository.save(course);
        return new Response("ok");
    }
}
