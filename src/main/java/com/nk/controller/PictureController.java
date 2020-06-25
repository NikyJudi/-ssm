package com.nk.controller;

import com.nk.model.Picture;
import com.nk.service.impl.PictureService;
import com.nk.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PictureController {
    @Autowired
    private PictureService pictureService;

    @Autowired
    private StudentService studentService;

    @RequestMapping("/a/{id}")
    public String more(@PathVariable("id") Long id, Model model){
        Picture picture = pictureService.findAllById(id);
        model.addAttribute("picture",picture);
        return "more";
    }

    @RequestMapping("/delete/{id}")
    public String deletePicture(@PathVariable("id") Long id){
        pictureService.deletePictureById(id);
        return "redirect:/students";
    }

    @RequestMapping("/delete/q/{id}")
    public String userDeletePic(@PathVariable("id") Long id) {
        String stuId = pictureService.findStuIdById(id);
        pictureService.deletePictureById(id);
        return "redirect:/myinfo/"+stuId;
    }
}
