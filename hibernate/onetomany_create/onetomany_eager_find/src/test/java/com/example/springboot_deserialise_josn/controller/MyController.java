package com.example.springboot_deserialise_josn.controller;

import com.example.springboot_deserialise_josn.Dao.PersonDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping("/AddPerson")
    public String addPerson(PersonDTO personDTO){
        return personDTO.name+" is "+personDTO.age+" years old ";
    }
}
