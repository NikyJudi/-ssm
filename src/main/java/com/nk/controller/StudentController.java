package com.nk.controller;

import com.nk.model.Picture;
import com.nk.model.Student;
import com.nk.model.User;
import com.nk.service.impl.PictureService;
import com.nk.service.impl.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.LinkedList;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private PictureService pictureService;

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
       student.setGrade(newStudent.getGrade());
       studentService.update(student, id);
       return "redirect:/students";
    }
    @RequestMapping("/list/{id}/update/form")
    public String form(@PathVariable("id") String id, Model model) {
        Student student = studentService.findStudent(id);
        model.addAttribute("student", student);
        List<Picture> list = pictureService.findAllByStuId(id);
        model.addAttribute("list", list);
        return "form";
    }

    @RequestMapping("/list/add")
    public String form(Student student) {
        studentService.addStudent(student);
        return "redirect:/students";
    }

//    http://localhost:8080/autor/2017
    @RequestMapping("/author/{id}")
    public String personal(@PathVariable("id") String id,Model model) {
        Student student = studentService.findStudent(id);
        List<Picture> list = pictureService.findAllByStuId(id);
        model.addAttribute("student",student);
        System.out.println(student);
        model.addAttribute("list",list);
        System.out.println(list);
        return "personal";
    }

    @RequestMapping("/list/find/1")
    public String find1(String id,Model model){
        System.out.println(id);
        List<Student> list = studentService.findStudentById(id);
        model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("/list/find/2")
    public String find2(String name,Model model){
        System.out.println(name);
        List<Student> list = studentService.findStudentByName(name);
        model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("/list/find/3")
    public String find3(Byte grade, Model model){
        System.out.println(grade);
        List<Student> list = studentService.findStudentByGrade(grade);
        model.addAttribute("list",list);
        return "list";
    }

//    http://localhost:8080/myinfo/2017
    @RequestMapping("/myinfo/{id}")
    public String myInfo(@PathVariable("id")String id, Model model){
        Student student = studentService.findStudent(id);
        List<Picture> list = pictureService.findAllByStuId(id);
        model.addAttribute("student", student);
        model.addAttribute("list",list);
        return "info";
    }

    //TODO
    @RequestMapping("/resetsig/{id}")
    public String updateSignature(@PathVariable("id")String id, String signature){
        studentService.updateSignature(id,signature);
        return "redirect:/myinfo/"+id;
    }

}
