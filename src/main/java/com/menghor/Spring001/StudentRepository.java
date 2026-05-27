package com.menghor.Spring001;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    // initialize same values for our
    private final  static ArrayList<Student> students = new ArrayList<>()
    {{
    add(new Student(1001, "Menghor", "Male"));
    add(new Student(1002, "Jane", "Female"));
    add(new Student(1003, "Jack", "Male"));
    add(new Student(1004, "Tom", "Male"));
    add(new Student(1005, "Jerry", "Male"));
    add(new Student(1006, "Rose", "Female"));
    }};

    // return all the student for rest controller
    public List<Student> getStudents(){
        return students;
    }
}
