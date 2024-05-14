package com.example.springboot_deserialise_josn.Dao;
import com.example.springboot_deserialise_josn.Entity.Course;
import com.example.springboot_deserialise_josn.Entity.instructor;

import com.example.springboot_deserialise_josn.Entity.instructordetail;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override public List<Course> findCoursesByInstructorId(int theId) {
        // create query
        TypedQuery<Course> query = entityManager.createQuery( "from Course where instructor.id = :data", Course.class);
        query.setParameter("data", theId);
        // execute query
        List<Course> courses = query.getResultList();
        return courses; }@Override public instructor findInstructorByIdJoinFetch(int theId) {
        // create query
        TypedQuery<instructor> query = entityManager.createQuery( "select i from Instructor i " + "JOIN FETCH i.courses " + "JOIN FETCH i.instructorDetail " + "where i.id = :data", instructor.class);
        query.setParameter("data", theId);
        // execute query
        instructor instructor = query.getSingleResult();
        return instructor; }
    @Override
    @Transactional
    public void update(instructor tempInstructor) {
        entityManager.merge(tempInstructor); }

    @Override
    @Transactional public void update(Course tempCourse) { entityManager.merge(tempCourse); }
    @Override
    public Course findCourseById(int theId) { return entityManager.find(Course.class,
            theId); }
    }



