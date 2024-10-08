package com.cheteen.cruddemo;

import com.cheteen.cruddemo.dao.AppDAO;
import com.cheteen.cruddemo.entity.Instructor;
import com.cheteen.cruddemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO){
		return runner -> {
			createInstructor(appDAO);
		};
	}

	private void createInstructor(AppDAO appDAO) {

//		Instructor tempInstructor = new Instructor("Nihat",
//				                                   "Çetin",
//				                                   "nihatcetin0143@gmail.com");
//
//		InstructorDetail tempInstructorDetail = new InstructorDetail(
//				"https://www.youtube.com/",
//				"reading a book"
//		);


		Instructor tempInstructor = new Instructor("Abdurrahman",
				"Seyda",
				"abdurrahmanseyda@gmail.com");

		InstructorDetail tempInstructorDetail = new InstructorDetail(
				"https://www.youtube.com/",
				"meeting with friends"
		);
		
		tempInstructor.setInstructorDetail(tempInstructorDetail);

		// This will also save the details object because of CascadeType.ALL
		System.out.println("Saving instructor: " + tempInstructor);
		appDAO.save(tempInstructor);
		System.out.println("Done !");

	}

}