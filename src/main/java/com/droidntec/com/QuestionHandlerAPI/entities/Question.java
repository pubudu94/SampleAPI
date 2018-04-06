package com.droidntec.com.QuestionHandlerAPI.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "notes")
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class Question {

    @Id
    private Long id ;

    @NotNull
    private String Question;

    @NotNull
    private String Answer_1 ;

    @NotNull
    private String Answer_2 ;

    @NotNull
    private String Answer_3 ;

    @NotNull
    private String Answer_correct ;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;


}
