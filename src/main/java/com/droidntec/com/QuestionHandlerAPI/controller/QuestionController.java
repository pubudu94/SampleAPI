package com.droidntec.com.QuestionHandlerAPI.controller;

import com.droidntec.com.QuestionHandlerAPI.entities.Question;
import com.droidntec.com.QuestionHandlerAPI.repository.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionsRepository questionsRepository ;

    @GetMapping("/questions")
    public List<Question> getAllQuestions() {
        return questionsRepository.findAll();
    }

    @GetMapping("/question/{id}")
    public Question getQuestion(@PathVariable(value = "id") Long questionId){
        return questionsRepository.getOne(questionId);
    }

    @GetMapping("/question/{id}")
    public Question getQuestion(@PathVariable(value = "id") Long questionId, @Valid @RequestBody Question question){

//        Question question = noteRepository.findById(noteId)
        return questionsRepository.getOne(questionId);
    }
}

