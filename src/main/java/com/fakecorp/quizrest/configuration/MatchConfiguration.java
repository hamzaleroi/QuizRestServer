package com.fakecorp.quizrest.configuration;




import com.fakecorp.quizrest.core.Match;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@EnableAutoConfiguration
@ComponentScan
public class MatchConfiguration {



    @Bean
    public Match createMatch() {
        return new Match();
    }




}
