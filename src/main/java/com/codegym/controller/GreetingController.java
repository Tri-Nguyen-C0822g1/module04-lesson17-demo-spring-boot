package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
    @GetMapping("/")
    public ModelAndView greeting(){
        ModelAndView modelAndView = new ModelAndView("/index");
        return modelAndView;
    }
}
