package com.example.controller;

import com.example.model.Customer;
import com.example.service.CustomerService;
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
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService = new CustomerService();

    @GetMapping("")
    public String displayList(Model model){
        List<Customer> customers = customerService.findall();
        model.addAttribute("customers",customers);
        return "/list";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("customer", new Customer());
        return "/create";
    }
    @PostMapping("/save")
    public String save(Customer customer){
        customer.setId((int) (Math.random()*1000));
        customerService.save(customer);
        return "redirect:/customer";
    }
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id ,Model model){
        model.addAttribute("customer",customerService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Customer customer){
        customerService.update(customer.getId(),customer);
        return "redirect:/customer";
    }
    @GetMapping("/{id}/delete")
    public String delete(Customer customer, RedirectAttributes attributes){
        customerService.remove(customer.getId());
        attributes.addFlashAttribute("success","Removed customer successfully!");
        return "redirect:/customer";
    }
    @GetMapping("/{id}/view")
    public String view(@PathVariable int id,Model model){
        model.addAttribute("customer",customerService.findById(id));
        return "/view";
    }
}
