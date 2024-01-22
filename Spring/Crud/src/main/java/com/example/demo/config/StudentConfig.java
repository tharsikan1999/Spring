package com.example.demo.config;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import java.util.List;

@Configuration
public class StudentConfig {

//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepo studentRepo) {
//        return args -> {
//         Student s1 =   new Student("Aman", "sample@gmaill.com", "12345678", 20);
//          Student s2 =  new Student("thanu", "funny@gmail.com", "12345678", 20);
//            Student s3 =  new Student("tha", "funny@gmail.com", "12345678", 20);
//            studentRepo.saveAll(
//                    List.of(s1, s2, s3)
//            );
//        };
//    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http.
                csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(authorize -> authorize.anyRequest().permitAll())
                .build();

    }
}
