package com.nk.controller;

import com.nk.model.Student;
import com.nk.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<Student> result = studentService.findAll();
        model.addAllAttributes(result);
        return "studentList";
    }

    @RequestMapping("/cc")
    public String fun() {
        System.out.println("jjjjj");
        return "studentList";
    }
}
