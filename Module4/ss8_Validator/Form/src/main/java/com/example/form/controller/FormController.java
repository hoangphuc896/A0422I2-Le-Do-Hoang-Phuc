package com.example.form.controller;

import com.example.form.entity.Form;
import com.example.form.service.FormServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/form")
public class FormController {
    @Autowired
    private FormServiceImpl formService;

    @GetMapping("")
    public String displayList(Model model) {
        model.addAttribute("forms", formService.displayForm());
        return "form/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("form", new Form());
        return "form/create";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("form") Form form, BindingResult bindingResult, RedirectAttributes attributes) {
        if (bindingResult.hasErrors()) {
            return "/form/create";
        }
        formService.create(form);
        attributes.addFlashAttribute("msg", "Bạn Thêm Mới Thành công");
        return "redirect:/form";
    }

    @GetMapping("/{id}/edit")
    public String update(@PathVariable String id, Model model) {
        Form form = formService.findById(id);
        model.addAttribute("form", form);
        return "form/update";
    }

    @PostMapping("/update")
    public String update(@Valid Form form, BindingResult bindingResult, RedirectAttributes attributes) {
        if (bindingResult.hasErrors()) {
            return "/form/update";
        }
        formService.update(form);
        attributes.addFlashAttribute("msg", "Bạn Update thành công");
        return "redirect:/form";
    }

    @GetMapping("/{id}/delete")
    public String delete(Form form, RedirectAttributes attributes) {
        formService.delete(form.getId());
        attributes.addFlashAttribute("msg", "Bạn Delete thành công");
        return "redirect:/form";
    }

//    @GetMapping("/{id}/delete")
//    public ResponseEntity<String> delete(Form form, RedirectAttributes attributes) {
//        formService.delete(form.getId());
//        attributes.addFlashAttribute("msg", "Bạn Delete thành công");
//        return new ResponseEntity<>(null, HttpStatus.OK);
//    }

    @PostMapping("/deleteAll")
    public String delete(@RequestParam("ids") String[] ids){
        formService.deleteAll(ids);
        return "redirect:/form";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable String id) {
        formService.findById(id);
        return "form/list";
    }

    @GetMapping("/search")
    public String search(@RequestParam("searchAll") String search, Model model) {
        List<Form> forms = formService.search(search, search);
        model.addAttribute("forms", forms);
        return "form/list";
    }
}
