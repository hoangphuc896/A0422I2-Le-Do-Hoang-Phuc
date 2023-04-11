package com.example.product_manager.controller;

import com.example.product_manager.model.Product;
import com.example.product_manager.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("")
    public String displayList(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "/product/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "/product/create";
    }

    @GetMapping("/{id}/update")
    public String update(@PathVariable int id, Model model, RedirectAttributes attributes) {
        model.addAttribute("product", productService.findById(id));
        attributes.addFlashAttribute("success", "Bạn Update Thành công");
        return "/product/update";
    }

    @GetMapping("/{id}/delete")
    public String delete(Product product, RedirectAttributes attributes) {
        productService.delete(product.getId());
        attributes.addFlashAttribute("success", "Bạn Xóa Thành Công");
        return "redirect:/product";
    }

    @PostMapping("/edit")
    public String edit(Product product) {
        productService.update(product);
        return "redirect:/product";
    }

    @PostMapping("/save")
    public String save(Product product) {
        productService.create(product);
        return "redirect:/product";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "product/view";
    }

}
