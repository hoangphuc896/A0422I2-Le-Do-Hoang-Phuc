package com.example.student.controller;

import com.example.student.entity.ClassName;
import com.example.student.service.ClassnameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/classname")
public class ClassNameController {

    @Autowired
    private ClassnameService classnameService;

    @GetMapping("")
    public String showList(Model model){
        List<ClassName> categories = classnameService.findAll();
        model.addAttribute("classnames",categories);
        return "classname/list";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("classname",new ClassName());
        return "classname/create";
    }
    @GetMapping("/{id}/edit")
    public String save(Model model, @PathVariable String id){
        ClassName className = classnameService.findById(id);
        model.addAttribute("classname",className);
        return "classname/edit";
    }
    @GetMapping("/{getIdClass}/delete")
    public String delete(ClassName className, RedirectAttributes attributes){
        classnameService.delete(className.getIdClass());
        attributes.addFlashAttribute("msg","bạn Xóa Lớp Thành công");
        return "redirect:/classname";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("classname") ClassName className, BindingResult bindingResult, RedirectAttributes attributes){
        if (bindingResult.hasErrors()){
            return "/classname/create";
        }
        classnameService.create(className);
        attributes.addFlashAttribute("msg","bạn thêm Lớp thành công");
        return "redirect:/classname";
    }
    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("classname") ClassName className,BindingResult bindingResult,RedirectAttributes attributes){
        if (bindingResult.hasErrors()){
            return "/classname/edit";
        }
        classnameService.update(className);
        attributes.addFlashAttribute("msg","bạn Update Lớp Thành công");
        return "redirect:/student";
    }
}
