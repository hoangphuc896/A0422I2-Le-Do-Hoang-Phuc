package com.example.blog.controller;

import com.example.blog.entity.UserRole;
import com.example.blog.entity.Users;
import com.example.blog.repository.RoleRepository;
import com.example.blog.repository.UserRoleRepository;
import com.example.blog.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private UserRoleRepository userRoleRepository;
    @Autowired
    private RoleRepository repository;


    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("user", new Users());
        return "/create";
    }

    @PostMapping("/create")
    public String addMew(@ModelAttribute("user") Users users, RedirectAttributes attributes) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        users.setPassword(encoder.encode(users.getPassword()));
        userService.create(users);
        attributes.addFlashAttribute("msg", "Bạn Đã Đăng Ký thành Công");
        return "redirect:/blog";
    }

    @GetMapping("/addRole")
    public String showAddRole(Model model) {
        model.addAttribute("userRole", new UserRole());
        model.addAttribute("users", userService.findAll());
        model.addAttribute("roles", repository.findAll());
        return "/addRole";
    }

    @PostMapping("/addRole")
    public String addRole(@ModelAttribute("userRole") UserRole userRole) {
        userRoleRepository.save(userRole);
        return "redirect:/blog";
    }
}
