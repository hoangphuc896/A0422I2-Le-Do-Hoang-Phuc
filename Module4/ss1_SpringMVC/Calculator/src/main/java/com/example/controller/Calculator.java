package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {

    @GetMapping("list")
    public String displayCalculator() {
        return "list";
    }

    @PostMapping("list")
    public String displayList(@RequestParam double usd , Model model){
        Double result = usd * 23.000;
        model.addAttribute("result", result );
        return "list";
    }
}
