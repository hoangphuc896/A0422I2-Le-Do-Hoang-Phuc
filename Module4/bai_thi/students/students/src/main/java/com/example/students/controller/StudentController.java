package com.example.students.controller;

import com.example.students.entity.ClassName;
import com.example.students.entity.Student;
import com.example.students.service.ClassnameService;
import com.example.students.service.StudentService;
import com.example.students.validate.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    Validate validate;

    @Autowired
    StudentService studentService;

    @Autowired
    ClassnameService classnameService;

    @ModelAttribute("classnames")
    public Iterable<ClassName> classNames() {
        return classnameService.findAll();
    }

    @GetMapping("")
    public String findAll(Model model,
                          @RequestParam("page") Optional<Integer> page,
                          @RequestParam("size") Optional<Integer> size,
                          @RequestParam("sort") Optional<String> sort) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(5);
        String sortField = sort.orElse("age");
        Page<Student> students = studentService.findAll(PageRequest.of(currentPage - 1, pageSize, Sort.by(sortField).descending()));
        int totalPages = students.getTotalPages();
        model.addAttribute("students", students);
        if (totalPages > 1) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
            model.addAttribute("pageNumber", pageNumbers);
        }
        return "student/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("student", new Student());
        return "student/create";
    }

    @PostMapping("create")
    public String addNew(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult, RedirectAttributes attributes) {
        validate.validate(student,bindingResult);
        if (bindingResult.hasErrors()) {
            return "/student/create";
        }
        studentService.addNew(student);
        attributes.addFlashAttribute("msg" ,"bạn Thêm mới thành công");
        return "redirect:/student";
    }

    @GetMapping("/{id}/edit")
    public String update(@PathVariable String id, Model model) {
        Student student = studentService.findById(id);
        model.addAttribute("student", student);
        return "student/update";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult, RedirectAttributes attributes) {
        if (bindingResult.hasErrors()) {
            return "/student/update";
        }
        studentService.update(student);
        attributes.addFlashAttribute("msg", "Bạn Update thành công");
        return "redirect:/student";
    }

    @GetMapping("/{id}/delete")
    public String delete(Student student, RedirectAttributes attributes) {
        studentService.delete(student.getId());
        attributes.addFlashAttribute("msg", "Bạn Delete thành công");
        return "redirect:/student";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable("id") String id,Model model){
        model.addAttribute("students",studentService.findByClassId(id));
        return "student/list";
    }

    @GetMapping("/search")
    public String search(@RequestParam("searchAll") String search, Model model) {
        List<Student> students = studentService.searchAll(search, search, search);
        model.addAttribute("students", students);
        return "student/list";
    }

    @GetMapping(value = "/deleteAll")
    public String delete(@RequestParam("ids") String[] ids){
        studentService.deleleAll(ids);
        return "redirect:/student";
    }
}
