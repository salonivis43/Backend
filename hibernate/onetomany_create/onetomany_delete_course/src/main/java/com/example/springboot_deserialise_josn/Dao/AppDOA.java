package com.example.springboot_deserialise_josn.Dao;

import com.example.springboot_deserialise_josn.Entity.Course;
import com.example.springboot_deserialise_josn.Entity.instructor;
import com.example.springboot_deserialise_josn.Entity.instructordetail;
import java.util.List;
public interface AppDOA {
    void save(instructor theInstructor);
    instructor findInstructorById(int theId);
    void deleteInstructorById(int theId);
    instructordetail findInstructorDetailById(int theId);
    void deleteInstructorDetailById(int theId);
    List<Course> findCoursesByInstructorId(int theId);
    instructor findInstructorByIdJoinFetch(int theId);
    void update(instructor tempInstructor);
    void update(Course tempCourse);
    Course findCourseById(int theId);
    void deleteCourseById(int theId);
}
