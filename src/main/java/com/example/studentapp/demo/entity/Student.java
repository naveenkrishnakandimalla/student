package com.example.studentapp.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "studentdetails")
public class Student implements Serializable {
    @Id
    @GeneratedValue
    public int id;
    public String schoolname;
    public String firstname;
    public String lastname;
    public String gender;
    public String clas;
    public String grade;


}
