package com.example.borad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("data", "안녕하세요");

        return "index";
    }
}
