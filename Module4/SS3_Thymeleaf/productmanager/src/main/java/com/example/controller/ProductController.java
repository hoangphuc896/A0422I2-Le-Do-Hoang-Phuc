package com.example.controller;

import com.example.model.Product;
import com.example.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/product")
public class    ProductController {
    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("")
    public String findAll(Model model){
        List<Product> products = productService.findAll();
        model.addAttribute("products",products);
        return "/list";
    }
    @GetMapping("/create")
    public String create(Model model){
    model.addAttribute("product",new Product());
    return "/create";
    }
    @PostMapping("/save")
    public String save(Product product){
        product.setId(+1);
        productService.save(product);
        return "redirect:/product";
    }
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id , Model model){
    model.addAttribute("product",productService.findById(id));
    return "/edit";
    }
    @PostMapping("/update")
    public String Update(Product product){
        productService.update(product);
        return "redirect:/product";
    }
    @GetMapping("/{id}/delete")
    public String delete(Product product , RedirectAttributes attributes){
        productService.delete(product.getId());
        attributes.addFlashAttribute("success","Bạn đã Xóa Thành Công");
        return "redirect:/product";
    }
    @GetMapping("/search")
    public String searchName(@RequestParam("searchName") String name , ModelMap model){
        List<Product> products = productService.SeachByName(name);
        model.addAttribute("products",products);
        return "/list";
    }
    @GetMapping("/{id}/view")
    public String view(@PathVariable int id , Model model){
    model.addAttribute("product",productService.findById(id));
    return "/view";
    }
}
