//package com.nk.config;
//
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.io.PrintWriter;
//import java.io.StringWriter;
//
//@ControllerAdvice
//public class ControllerInterceptor {
//
//    @ExceptionHandler(Exception.class)
//    public ModelAndView handle(Exception e){
//        StringWriter stringWriter = new StringWriter();
//        PrintWriter printWriter = new PrintWriter(stringWriter);
//        e.printStackTrace(printWriter);
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("message", e.getMessage());
//        modelAndView.addObject("stackTrace", stringWriter.toString());
//        modelAndView.setViewName("error");
//        return modelAndView;
//    }
//}
