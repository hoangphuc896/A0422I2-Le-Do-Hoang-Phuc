package com.example.controller;

import com.example.model.Email;
import com.example.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/email")
public class EmailController {
    @Autowired
    private EmailService emailService ;

    @GetMapping("")
    public String List(Model model){
    model.addAttribute("emails",new EmailService().findAll());
    return "list";
    }
    @GetMapping("/update")
    public String update(Model model){
        model.addAttribute("email",new Email("",10,false,""));
        model.addAttribute("langueEnglish",new String[] {"english","nhật","mỹ","canada"});
        model.addAttribute("pagesize", new int[]{5,10,15,20,25});
        return "update";
    }
    @PostMapping("/edit")
    public String edit(Email email, RedirectAttributes attributes){
        emailService.update(email);
        attributes.addFlashAttribute("success","Bạn đã update thành công");
        return "redirect:/email";
    }
}
