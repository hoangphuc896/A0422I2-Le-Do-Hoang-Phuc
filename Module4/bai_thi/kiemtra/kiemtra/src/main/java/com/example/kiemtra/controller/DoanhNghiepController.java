package com.example.kiemtra.controller;


import com.example.kiemtra.entity.DoanhNghiep;
import com.example.kiemtra.service.DoanhNghiepServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/doanhnghiep")
public class DoanhNghiepController {
    @Autowired
    private DoanhNghiepServiceImpl doanhNghiepService;

    @GetMapping("")
    public String showList(Model model){
        List<DoanhNghiep> doanhNghieps = doanhNghiepService.findAll();
        model.addAttribute("doanhNghieps",doanhNghieps);
        return "doanhnghiep/list";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("DoanhNghiep",new DoanhNghiep());
        return "doanhnghiep/create";
    }
    @GetMapping("/{id}/edit")
    public String save(Model model, @PathVariable String id){
        DoanhNghiep doanhNghiep = doanhNghiepService.findById(id);
        model.addAttribute("DoanhNghiep",doanhNghiep);
        return "doanhnghiep/edit";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable("id") String id, RedirectAttributes attributes){
        doanhNghiepService.delete(id);
        attributes.addFlashAttribute("msg","bạn Xóa Lớp Thành công");
        return "redirect:/doanhnghiep";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("DoanhNghiep") DoanhNghiep doanhNghiep, BindingResult bindingResult, RedirectAttributes attributes){
        if (bindingResult.hasErrors()){
            return "/doanhnghiep/create";
        }
        doanhNghiepService.create(doanhNghiep);
        attributes.addFlashAttribute("msg","bạn thêm Lớp thành công");
        return "redirect:/doanhnghiep";
    }
    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("DoanhNghiep") DoanhNghiep doanhNghiep,BindingResult bindingResult,RedirectAttributes attributes){
        if (bindingResult.hasErrors()){
            return "/doanhnghiep/edit";
        }
        doanhNghiepService.update(doanhNghiep);
        attributes.addFlashAttribute("msg","bạn Update Lớp Thành công");
        return "redirect:/duan";
    }

}
