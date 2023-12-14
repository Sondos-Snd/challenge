package com.example.sender.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "tasks")
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer taskId;

    private Integer calcSent;

    private Integer calcRecieved;

    private String action;


}
