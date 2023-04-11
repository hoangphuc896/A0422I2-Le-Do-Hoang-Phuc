package com.example.blog.controller;

import com.example.blog.entity.Blog;
import com.example.blog.entity.Category;
import com.example.blog.service.BlogServiceImpl;
import com.example.blog.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    BlogServiceImpl blogService;

    @Autowired
    CategoryServiceImpl categoryService;

    @ModelAttribute("categorises")
    public Iterable<Category> categories() {
        return categoryService.findAll();
    }
    
    @GetMapping("")
    public String findAll(Model model,
                          @RequestParam("page") Optional<Integer> page,
                          @RequestParam("size") Optional<Integer> size,
                          @RequestParam("sort") Optional<String> sort) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(2);
        String sortField = sort.orElse("date");
//        Sort sortBy = Sort.by("email").descending().and(Sort.by("phoneNumber").ascending());
        Page<Blog> blogs = blogService.findAll(PageRequest.of(currentPage -1, pageSize, Sort.by(sortField).descending()));
        model.addAttribute("blogs",blogs);
        int totalPages = blogs.getTotalPages();
        if (totalPages > 1) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
            model.addAttribute("pageNumber", pageNumbers);
        }
        return "blog/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("categorises",categoryService.findAll());
        return "blog/create";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable int id) {
        Blog blog = blogService.findById(id);
        model.addAttribute("blog",blog);
        return "blog/update";
    }
    @GetMapping("/{id}/delete")
    public String delete(Blog blog , RedirectAttributes attributes){
        blogService.delete(blog.getId());
        attributes.addFlashAttribute("msg","Bạn thành công xóa");
        return "redirect:/blog";
    }
    @GetMapping("/search")
    public String searchByTitle(Model model,@RequestParam("title") String title){
        List<Blog> blogs = blogService.findByTitle(title);
        model.addAttribute("blogs",blogs);
        return "blog/list";
    }
    @PostMapping("/create")
    public String addNew( Blog blog,RedirectAttributes attributes){
        blogService.create(blog);
        attributes.addFlashAttribute("msg" ,"Bạn Thêm Mới Thành công");
        return "redirect:/blog";
    }
    @PostMapping("/update")
    public String update(Blog blog ,RedirectAttributes attributes){
        blogService.update(blog);
        attributes.addFlashAttribute("msg", "Bạn Update thành công");
        return "redirect:/blog";
    }
    @GetMapping("/{id}/view")
    public String view(@PathVariable("id") int id,Model model){
        model.addAttribute("blogs",blogService.findByCategoryId(id));
        return "blog/list";
    }

}
