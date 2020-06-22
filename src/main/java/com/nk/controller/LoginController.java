package com.nk.controller;

import com.nk.model.User;
import com.nk.service.impl.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping ("/login")
    public String login(User user){
        User user1 = loginService.login(user);
        System.out.println(user1);
        System.out.println(user);
        return "success";
    }

    @RequestMapping ("/login2")
    public String login(){

        return "success";
    }

}
