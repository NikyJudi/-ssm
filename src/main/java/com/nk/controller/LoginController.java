package com.nk.controller;

import com.nk.model.Picture;
import com.nk.model.Student;
import com.nk.model.User;
import com.nk.service.impl.LoginService;
import com.nk.service.impl.PictureService;
import com.nk.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private PictureService pictureService;

    @RequestMapping ("/login")
    public String login(Model model, User user, HttpServletRequest httpServletRequest){
        if (user.getId() == null || user.getPassword() == null) {
            return "redirect:/";
        }
        System.out.println(user);
        User user1 = loginService.login(user);
        System.out.println(user1);
        if (user1 == null) {
            return "redirect:/";
        } else {
            HttpSession session = httpServletRequest.getSession();
            session.setAttribute("user", user1);
            System.out.println("loginController"+session.getAttribute("user"));
            if (user1.getIdentity() == 1) {
                model.addAttribute("list",studentService.findAll());
                return "list";
            } else {
                //TODO
                List<Picture> list = pictureService.findAll();
                for (Picture picture: list) {
                    System.out.println("picture"+picture);
                    String id = pictureService.findStuIdById(picture.getId());
                    System.out.println("pictureId"+id);
                    Student student = studentService.findStudent(id);
                    System.out.println("student"+student);
                    picture.setStudent(student);
                    System.out.println("picture"+picture);
                    System.out.println("作者名：-----"+picture.getStudent().getName());
                }
                Student student = studentService.findStudent(user1.getId());
                model.addAttribute("student",student);
                model.addAttribute("pictures",list);
                return "home";
            }
        }
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(User user) {
        loginService.addUser(user);
        System.out.println(user);
        return "redirect:/";
    }

    @RequestMapping("/register/form")
    public String reg() {
        return "register";
    }


    //TODO
    //前端
    @RequestMapping("/resetpw/{id}")
    public String resetPW(@PathVariable("id")String id){
        return "redirect:/resetpw";
    }

    @RequestMapping("/resetpw")
    public String resetPW2(String id, String password){
        System.out.println(id+password);
        loginService.updatePWById(id,password);
        return null;
    }
}
