package com.nk.controller;

import com.nk.model.User;
import com.nk.service.impl.LoginService;
import com.nk.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private StudentService studentService;

    @RequestMapping ("/login")
    public String login(Model model, User user, HttpServletRequest httpServletRequest){
        if (user.getId() == null || user.getPassword() == null) {
            return "redirect:/";
        }
        User user1 = loginService.login(user);
        if (user1 == null) {
            return "redirect:/";
        } else {
            HttpSession session = httpServletRequest.getSession();
            session.setAttribute("user", user1);
            System.out.println("loginController"+session.getAttribute("user"));
            model.addAttribute("list",studentService.findAll());
            return "list";
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
}
