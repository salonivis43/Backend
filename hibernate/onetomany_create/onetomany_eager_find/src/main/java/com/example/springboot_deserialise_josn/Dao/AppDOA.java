package com.example.springboot_deserialise_josn.Dao;

import com.example.springboot_deserialise_josn.Entity.instructor;
import com.example.springboot_deserialise_josn.Entity.instructordetail;

public interface AppDOA {
    void save(instructor theInstructor);
    instructor findInstructorById(int theId);
    void deleteInstructorById(int theId);
    instructordetail findInstructorDetailById(int theId);
    void deleteInstructorDetailById(int theId);
}
