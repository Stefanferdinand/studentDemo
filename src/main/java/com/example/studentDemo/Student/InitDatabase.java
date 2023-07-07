package com.example.studentDemo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDatabase {

    @Bean(name = "initialDatabase")
    CommandLineRunner initDatabase(StudentRepository repository){
        return args -> {
              repository.save(new Student("Stefan", 22));
              repository.save(new Student("Ferdinand", 18));
        };
    }

}
