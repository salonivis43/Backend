package com.example.springboot_deserialise_josn.Dao;
import com.example.springboot_deserialise_josn.Entity.instructor;

import com.example.springboot_deserialise_josn.Entity.instructordetail;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class AppDOAImpl implements AppDOA {
    // define field for entity manager
    private EntityManager entityManager;
    // inject entity manager using constructor injection
    @Autowired
    public AppDOAImpl(EntityManager entityManager) { this.entityManager = entityManager; }
    @Override
    @Transactional
    public void save(instructor theInstructor) {
        entityManager.persist(theInstructor); }

    @Override public instructor findInstructorById(int theId) {
        return entityManager.find(instructor.class, theId);
    }
    @Override
    @Transactional
    public void deleteInstructorById(int theId) {
    // retrieve the instructor
        instructor tempInstructor = entityManager.find(instructor.class, theId);
        // delete the instructor
        entityManager.remove(tempInstructor); }
    @Override public instructordetail findInstructorDetailById(int theId) {
        return entityManager.find(instructordetail.class, theId); }
    @Override

    @Transactional
    public void deleteInstructorDetailById(int theId) {
        // retrieve instructor detail
        instructordetail tempInstructorDetail = entityManager.find(instructordetail.class, theId);
        // remove the associated object reference // break bi-directional link //
        tempInstructorDetail.getInstructor().setInstructorDetail(null);
        // delete the instructor detail
        entityManager.remove(tempInstructorDetail); }
    }



