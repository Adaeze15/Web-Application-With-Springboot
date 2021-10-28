package com.example.StudentRestApisExample.service;

import com.example.StudentRestApisExample.model.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

 //TODO: Hard Coded this for testing will remove once connected to database
    List<Student> studentList = Arrays.asList(
            new Student("Alpha", "male", 27),
            new Student("Ben", "male", 34),
            new Student("Eliz", "female", 25),
            new Student("Blessing", "Female", 23),
            new Student("KD", "male", 29));

    //to get the student object
    public List<Student> getMales() {

        List<Student> males = studentList.stream()
                .filter(student -> student
                        .getGender().equalsIgnoreCase("Male"))
                .collect(Collectors.toList());

        return males;
    }
           /*it is creating a list of student, calling the males, using stream that converts the list into
        a string api and collect the answers in a list*/

        public List<Student> getFemales(){
            List<Student> Females = studentList.stream()
                    .filter(student -> student
                            .getGender().equalsIgnoreCase("Female"))
                    .collect(Collectors.toList());
            return Females;
        }

    }