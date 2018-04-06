package com.droidntec.com.QuestionHandlerAPI.repository;

import com.droidntec.com.QuestionHandlerAPI.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionsRepository extends JpaRepository<Question, Long> {

}
