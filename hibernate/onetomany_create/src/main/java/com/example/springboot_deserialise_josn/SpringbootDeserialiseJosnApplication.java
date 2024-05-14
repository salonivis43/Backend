package com.example.springboot_deserialise_josn;

import com.example.springboot_deserialise_josn.Dao.AppDOA;
import com.example.springboot_deserialise_josn.Entity.Course;
import com.example.springboot_deserialise_josn.Entity.instructor;
import com.example.springboot_deserialise_josn.Entity.instructordetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootDeserialiseJosnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDeserialiseJosnApplication.class, args);
	}


	@Bean public CommandLineRunner commandLineRunner(AppDOA appDOA) {
		return runner -> {
		// createInstructor(appDAO);
			// findInstructor(appDAO);
			// deleteInstructor(appDAO);
			// findInstructorDetail(appDAO);
			// deleteInstructorDetail(appDAO);
			createInstructorWithCourses(appDOA);
		};
	}

	private void createInstructorWithCourses(AppDOA appDOA) {

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
		// save the
		System.out.println("Saving instructor: " + tempInstructor);
		System.out.println("The courses: " + tempInstructor.getCourses());
		appDOA.save(tempInstructor);
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
		System.out.println("Done!"); }

	private void deleteInstructor(AppDOA appDAO) {
		int theId = 1;
		System.out.println("Deleting instructor id: " + theId);
		appDAO.deleteInstructorById(theId);
		System.out.println("Done!"); }

	private void findInstructor(AppDOA appDAO) {
		int theId = 2;
		System.out.println("Finding instructor id: " + theId);
		instructor tempInstructor = appDAO.findInstructorById(theId);
		System.out.println("tempInstructor: " + tempInstructor);
		System.out.println("the associated instructorDetail only: " + tempInstructor.getInstructorDetail()); }


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
