package com.example.springdbconfig.Controller;


import com.example.springdbconfig.Model.Professor;
import com.example.springdbconfig.Model.Response;
import com.example.springdbconfig.Repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {

    @Autowired
    ProfessorRepository professorRepository;
@PostMapping("/ddprofessor")
    public Response Addprofessor(Professor professor){
        professorRepository.save(professor);
        return new Response("ok");
    }

}
