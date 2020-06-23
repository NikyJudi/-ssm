package com.nk.controller;

import com.nk.model.Student;
import com.nk.model.User;
import com.nk.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/students")
    public String students(HttpSession session, Model model) {
        User user = (User) session.getAttribute("user");
        List<Student> students =studentService.findAll();
        model.addAttribute("list", students);
        return "list";
    }



    // http://localhost:8080/list/233/delete
    @RequestMapping("/list/{id}/delete")
    public String delete(@PathVariable("id") String id) {
        studentService.deleteStudent(id);
        return "redirect:/students";
    }

    @RequestMapping("/list/{id}/update")
    public String update(@PathVariable("id") String id, Student newStudent) {
       Student student = studentService.findStudent(id);
       student.setId(newStudent.getId());
       student.setName(newStudent.getName());
       student.setMoney(newStudent.getMoney());
       studentService.update(student, id);
       return "redirect:/students";
    }
    @RequestMapping("/list/{id}/update/form")
    public String form(@PathVariable("id") String id,Model model) {
        Student student = studentService.findStudent(id);
        model.addAttribute("student",student);
        return "form";
    }
}
