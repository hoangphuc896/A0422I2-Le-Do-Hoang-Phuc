package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ComputerController {

    @GetMapping("list")
    public String DisplayHome() {
        return "list";
    }

    @PostMapping("list")
    public String DisplayResult(@RequestParam("numberone") double numberone, @RequestParam("numbertwo") double numbertwo, @RequestParam("enter") String enter, Model model) {
        double result = 0;
        switch (enter) {
            case "X":
                result = numberone * numbertwo;
                break;
            case "+":
                result = numberone + numbertwo;
                break;
            case "/":
                try {
                    result = numberone / numbertwo;
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
                break;
            case "-":
                result = numberone - numbertwo;
                break;
        }
        model.addAttribute("result", result);
        return "list";
    }
}
