package com.menghor.Spring001;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static org.apache.tomcat.util.net.openssl.OpenSSLStatus.getName;

@RestController
@RequestMapping("/api/v1/student")
public class StudentRestController {

    private final StudentRepository studentRepository;
    public StudentRestController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @GetMapping("")
    public Map<String, Object> getStudents() {
        Map<String, Object> map = new HashMap<>();
        map.put("students", studentRepository.getStudents());
        map.put("message", "success");
        return map;
    }

}
