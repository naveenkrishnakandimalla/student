package com.example.studentapp.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "studentDetails")
public class Student {
    @Id
    @GeneratedValue
    public int id;
    public String schoolName;
    public String firstName;
    public String lastName;
    public String gender;
    public String clas;
    public String grade;


}
