package com.example.blog.controller;

import com.example.blog.entity.Category;
import com.example.blog.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryServiceImpl categoryService;


    @GetMapping("")
    public String showList(Model model){
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categorises",categories);
        return "category/list";
    }
    @GetMapping("/create")
    public String create(Model model){
       model.addAttribute("category",new Category());
       return "category/create";
    }
    @GetMapping("/{id}/edit")
    public String save(Model model, @PathVariable int id){
        Category category = categoryService.findById(id);
        model.addAttribute("category",category);
        return "category/edit";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes attributes){
        categoryService.delete(id);
        attributes.addFlashAttribute("msg","bạn Xóa Danh Mục Thành công");
        return "redirect:/category";
    }

    @PostMapping("/create")
    public String create(Category category,RedirectAttributes attributes){
        categoryService.create(category);
        attributes.addFlashAttribute("msg","bạn thêm Danh Mục thành công");
        return "redirect:/category";
    }
    @PostMapping("/update")
    public String update(Category category,RedirectAttributes attributes){
        categoryService.update(category);
        attributes.addFlashAttribute("msg","bạn Update Danh Mục Thành công");
        return "redirect:/blog";
    }
}
