package com.fakecorp.quizrest;

import com.fakecorp.quizrest.controller.MatchController;
import com.fakecorp.quizrest.core.Match;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackageClasses = MatchController.class)
@ComponentScan(basePackageClasses = Match.class)
@EnableJpaRepositories
public class QuizrestApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuizrestApplication.class, args);
    }

}
