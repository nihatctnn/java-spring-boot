package com.cheteen.cruddemo;

import com.cheteen.cruddemo.dao.IStudentDAO;
import com.cheteen.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(IStudentDAO studentDAO){

		return runner -> {

			// createStudent(studentDAO);
			 createMultipleStudent(studentDAO);
			// readStudent(studentDAO);
			// queryForStudents(studentDAO);
			// updateStudent(studentDAO);
			//deleteStudent(studentDAO);

		};
	}

	private void deleteStudent(IStudentDAO studentDAO) {

		int studentId = 4;
		System.out.println("Deleting student with id: " + studentId);
		studentDAO.delete(studentId);
	}

	private void updateStudent(IStudentDAO studentDAO){

		int studentId = 1;
		System.out.println("Getting student with id: " + studentId);
		Student myStudent = studentDAO.findById(studentId);

		System.out.println("Updating student ...");
		myStudent.setFirstName("Nihat");

		studentDAO.update(myStudent);

		System.out.println("Updated student: " + myStudent);
	}

	private void queryForStudents(IStudentDAO studentDAO) {

		List<Student> theStudents = studentDAO.findAll();

		for(Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}

	}

	private void readStudent(IStudentDAO studentDAO){

		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Murat", "Çetin", "muratcetin0143@gmail.com");

		System.out.println("Saving the students ...");
		studentDAO.save(tempStudent);

		int theId = tempStudent.getId();
		System.out.println("Saved student. Generated id: " + theId);

		System.out.println("Retrieving student with id: " + theId);
		Student myStudent = studentDAO.findById(theId);

		System.out.println("Found the student: " + myStudent);
	}


	private void createMultipleStudent(IStudentDAO studentDAO){

		System.out.println("Creating 3 student objects ...");
		Student tempStudent1 = new Student("Mehmet", "Çetin", "mehmetcetin0143@gmail.com");
		Student tempStudent2 = new Student("Ömer", "Çetin", "ömercetin0143@gmail.com");
		Student tempStudent3 = new Student("Fatih", "Çetin", "fatihcetin0143@gmail.com");

		System.out.println("Saving the students ...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}

	private void createStudent(IStudentDAO studentDAO) {

		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Nihat", "Çetin", "nihatcetin0143@gmail.com");

		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		System.out.println("Saved student. Generated id: " + tempStudent.getId());

	}

}