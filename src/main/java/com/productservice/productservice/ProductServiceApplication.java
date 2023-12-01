package com.productservice.productservice;

import com.productservice.productservice.inheritancerelations.singletable.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner  {
    private MentorRepository mentorRepository;
    private UserRepository userRepository;
    private StudentRepository studentRepository;

    ProductServiceApplication(@Qualifier("st_mentorrepo") MentorRepository mentorRepository,
                              @Qualifier("st_userrepo") UserRepository userRepository,
                              @Qualifier("st_studentrepo") StudentRepository studentRepository) {
        this.mentorRepository = mentorRepository;
        this.userRepository = userRepository;
        this.studentRepository = studentRepository;
    }


//    private final MentorRepository mentorRepository;
//    private final StudentRepository studentRepository;
//
//    private final UserRepository userRepository;
//
//    ProductServiceApplication(@Qualifier("tpc_mentorrepository") MentorRepository mentorRepository,
//                              StudentRepository studentRepository,
//                              UserRepository userRepository) {
//        this.mentorRepository = mentorRepository;
//        this.studentRepository = studentRepository;
//        this.userRepository = userRepository;
//    }

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Mentor mentor = new Mentor();
//        mentor.setName("Deepak");
//        mentor.setEmail("deepak.kasera@scaler.com");
//        mentor.setAvgRating(4.8);
//
//        mentorRepository.save(mentor);


        //tpc_mentor
//        Mentor mentor = new Mentor();
//        mentor.setName("Deepak");
//        mentor.setEmail("deepak.kasera@scaler.com");
//        mentor.setAvgRating(4.7);
//        mentorRepository.save(mentor);
//
//
//        Student student = new Student();
//        student.setEmail("abhishek@scaler.com");
//        student.setName("Abhishek");
//        student.setPsp(90.0);
//        studentRepository.save(student);
//
//        User user = new User();
//        user.setEmail("arshi@gmail.com");
//        user.setName("Arshi");
//        userRepository.save(user);
//
//        //Get all the Users.
//        List<User> users = userRepository.findAll();
//
//        for (User user1 : users) {
//            System.out.println(user1.toString());
//        }


        User user = new User();
        user.setName("Arshi");
        user.setEmail("arshi@gmail.com");
        userRepository.save(user);

        Mentor mentor = new Mentor();
        mentor.setName("Deepak");
        mentor.setEmail("deepak.kasera@scaler.com");
        mentor.setAvgRating(4.7);
        mentorRepository.save(mentor);

        Student student = new Student();
        student.setName("harsh");
        student.setEmail("harsh@gmail.com");
        student.setPsp(99.0);
        studentRepository.save(student);

    }
}
