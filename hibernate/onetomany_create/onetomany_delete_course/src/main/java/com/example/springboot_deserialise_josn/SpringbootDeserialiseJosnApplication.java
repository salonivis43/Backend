package com.example.springboot_deserialise_josn;

import com.example.springboot_deserialise_josn.Dao.AppDOA;
import com.example.springboot_deserialise_josn.Entity.Course;
import com.example.springboot_deserialise_josn.Entity.instructor;
import com.example.springboot_deserialise_josn.Entity.instructordetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.ArrayList;
import java.util.List;
@SpringBootApplication
public class SpringbootDeserialiseJosnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDeserialiseJosnApplication.class, args);
	}


	@Bean public CommandLineRunner commandLineRunner(AppDOA appDOA) {
		return runner -> {
//			createInstructor(appDOA);
			// findInstructor(appDAO);
			// deleteInstructor(appDAO);
			// findInstructorDetail(appDAO);
			// deleteInstructorDetail(appDAO);
			// createInstructorWithCourses(appDAO);
//			findInstructorWithCourses(appDOA);
			// findCoursesForInstructor(appDAO);
//			findInstructorWithCoursesJoinFetch(appDOA);
//			updateInstructor(appDOA);
//			updateCourse(appDOA);
//			deleteInstructor(appDOA);
			deleteCourse(appDOA);
		};
	}

	private void deleteCourse(AppDOA appDOA) {
		int theId = 10;
		System.out.println("Deleting course id: " + theId);
		appDOA.deleteCourseById(theId);
		System.out.println("Done!");

	}

	private void updateCourse(AppDOA appDOA) {
		int theId = 10;
		// find the course
		System.out.println("Finding course id: " + theId);
		Course tempCourse = appDOA.findCourseById(theId);
		// update the course
		System.out.println("Updating course id: " + theId);
		tempCourse.setTitle("Enjoy the Simple Things");
		appDOA.update(tempCourse);
		System.out.println("Done!");
	}

	private void updateInstructor(AppDOA appDOA) {
		int theId = 1; // find the instructor
		System.out.println("Finding instructor id: " + theId);
		instructor tempInstructor = appDOA.findInstructorById(theId);
		// update the instructor
		System.out.println("Updating instructor id: " + theId);
		tempInstructor.setLastName("TESTER");
		appDOA.update(tempInstructor);
		System.out.println("Done!");
	}

	private void findInstructorWithCoursesJoinFetch(AppDOA appDAO) {
		int theId = 1;
		// find the instructor
		System.out.println("Finding instructor id: " + theId);
		instructor tempInstructor = appDAO.findInstructorByIdJoinFetch(theId);
		System.out.println("tempInstructor: " + tempInstructor);
		System.out.println("the associated courses: " + tempInstructor.getCourses());
		System.out.println("Done!");
	}private void findCoursesForInstructor(AppDOA appDAO) {
		int theId = 1;
		// find instructor
		System.out.println("Finding instructor id: " + theId);
		instructor tempInstructor = appDAO.findInstructorById(theId);
		System.out.println("tempInstructor: " + tempInstructor);
		// find courses for instructor
		System.out.println("Finding courses for instructor id: " + theId);
		List<Course> courses = appDAO.findCoursesByInstructorId(theId);
		// associate the objects
		tempInstructor.setCourses(courses);
		System.out.println("the associated courses: " + tempInstructor.getCourses());
		System.out.println("Done!"); }



	private void findInstructorWithCourses(AppDOA appDAO) {
		int theId = 1;
	System.out.println("Finding instructor id: " + theId);
	instructor tempInstructor = appDAO.findInstructorById(theId);
	System.out.println("tempInstructor: " + tempInstructor);
	System.out.println("the associated courses: " + tempInstructor.getCourses());
		System.out.println("Done!"); }

	private void createInstructorWithCourses(AppDOA appDAO) {
		// create the instructor
		instructor tempInstructor = new instructor("Susan", "Public", "susan.public@micron.com");
		// create the instructor detail
		instructordetail tempInstructorDetail = new instructordetail( "http://www.youtube.com", "Video Games");
		// associate the objects
		tempInstructor.setInstructorDetail(tempInstructorDetail);
		// create some courses
		Course tempCourse1 = new Course("Air Guitar - The Ultimate Guide");
		Course tempCourse2 = new Course("The Pinball Masterclass");
		// add courses to instructor
		tempInstructor.add(tempCourse1);
		tempInstructor.add(tempCourse2);
		// save the instructor //// NOTE: this will ALSO save the courses // because of CascadeType.PERSIST //
		System.out.println("Saving instructor: " + tempInstructor);
		System.out.println("The courses: " + tempInstructor.getCourses());
		appDAO.save(tempInstructor);
		System.out.println("Done!");
	}

	private void deleteInstructorDetail(AppDOA appDAO) {
		int theId = 3;
		System.out.println("Deleting instructor detail id: " + theId);

		appDAO.deleteInstructorDetailById(theId);
		System.out.println("Done!");
	}
	private void findInstructorDetail(AppDOA appDAO) {
		// get the instructor detail object
		int theId = 2;
		instructordetail tempInstructorDetail = appDAO.findInstructorDetailById(theId);
		// print the instructor detail
		System.out.println("tempInstructorDetail: " + tempInstructorDetail);
		// print the associated instructor
		System.out.println("the associated instructor: " + tempInstructorDetail.getInstructor());
		System.out.println("Done!");
	}
	private void deleteInstructor(AppDOA appDAO) {
		int theId = 1;
		System.out.println("Deleting instructor id: " + theId);
		appDAO.deleteInstructorById(theId);
		System.out.println("Done!");
	}
	private void findInstructor(AppDOA appDAO) {
		int theId = 2;
		System.out.println("Finding instructor id: " + theId);
		instructor tempInstructor = appDAO.findInstructorById(theId);
		System.out.println("tempInstructor: " + tempInstructor);
		System.out.println("the associated instructorDetail only: " + tempInstructor.getInstructorDetail());
	}


	private void createInstructor(AppDOA appDAO) {
		/*
		// create the instructor
		 Instructor tempInstructor =
		  new Instructor("Chad", "Darby", "darby@micron.com");
		  // create the instructor detail
		  InstructorDetail tempInstructorDetail =
		  new InstructorDetail(
		   "http://www.micron.com/youtube", "Luv 2 code!!!");
		   */
		// create the instructor
		instructor tempInstructor =
				new instructor("Madhu", "Patel", "madhu@micron.com");
		// create the instructor detail
		instructordetail tempInstructorDetail =
				new instructordetail(
						"http://www.micron.com/youtube", "Guitar");
		// associate the objects
		tempInstructor.setInstructorDetail(tempInstructorDetail);
		// save the instructor //
		// NOTE: this will ALSO save the details object
		// because of CascadeType.ALL //
		System.out.println("Saving instructor: " + tempInstructor);
		appDAO.save(tempInstructor);
		System.out.println("Done!");
	}
}
