package com.fakecorp.quizrest.DAO;

import org.springframework.data.jpa.repository.JpaRepository;



public interface QuestionRepository extends JpaRepository<Question,Long> {

}
