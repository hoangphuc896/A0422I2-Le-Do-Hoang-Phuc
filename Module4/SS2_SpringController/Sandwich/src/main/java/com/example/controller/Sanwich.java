package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class Sanwich {

    @GetMapping("list")
    public String displayHome() {
        return "list";
    }

    @PostMapping("list")
    public String displayResult(@RequestParam("spice") String[] spice, ModelMap modelMap){
        String result = Arrays.toString(spice);
        modelMap.addAttribute("result",result);
        return "list";
    }
}
