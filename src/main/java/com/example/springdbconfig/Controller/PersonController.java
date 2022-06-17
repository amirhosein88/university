package com.example.springdbconfig.Controller;

import com.example.springdbconfig.Model.Person;
import com.example.springdbconfig.Model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @PostMapping("/adduser")
    public Response addperson(@RequestBody Person person){
        Person p = personRepository.save(person);
        return new  Response("ok");
    }
}
