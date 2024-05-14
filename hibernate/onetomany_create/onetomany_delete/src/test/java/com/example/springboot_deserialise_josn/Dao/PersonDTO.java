package com.example.springboot_deserialise_josn.Dao;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;


public class PersonDTO {

    //JSON PROPERTIES               // DTO PROPERTIES
    @JsonFormat(pattern = "dd.mm.yyyy")public LocalDate birthday;
    @JsonProperty("First Name")        public  String name;   //Completely different name(and with space
    @JsonProperty("Age")               public  Integer age;  //UPPERCASE A

    //JSON PROPERTIES               // SETTERS
    @JsonFormat(pattern = "dd.mm.yyyy")public void setBirthday(LocalDate birthday){ this.birthday=birthday;}
    @JsonProperty("First Name")        public  void  setName(String name){this.name=name;}
    @JsonProperty("Age")               public  void  setAge(Integer age){this.age=age;}


    //CONSTRUCTOR
    @JsonCreator
    private  PersonDTO(
    @JsonFormat(pattern = "dd.mm.yyyy") LocalDate birthday,
    @JsonProperty("First Name")  String name,
    @JsonProperty("Age")   Integer age

    )
    {
        this.birthday=birthday;
        this.name=name;
        this.age=age;
    }
}
