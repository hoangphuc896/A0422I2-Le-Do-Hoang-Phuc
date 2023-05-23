package com.example.kiemtra.controller;

import com.example.kiemtra.entity.DoanhNghiep;
import com.example.kiemtra.entity.DuAn;
import com.example.kiemtra.service.DoanhNghiepServiceImpl;
import com.example.kiemtra.service.DuAnServiceImpl;
import com.example.kiemtra.validate.Validate;
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
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


@Controller
@RequestMapping("/duan")
public class DuAnController {

    @Autowired
    Validate validate;

    @Autowired
    DuAnServiceImpl duAnService;

    @Autowired
    DoanhNghiepServiceImpl doanhNghiepService;

    @ModelAttribute("doanhnghieps")
    public Iterable<DoanhNghiep> classNames() {
        return doanhNghiepService.findAll();
    }

    @GetMapping("")
    public String findAll(Model model,
                          @RequestParam("page") Optional<Integer> page,
                          @RequestParam("size") Optional<Integer> size,
                          @RequestParam("sort") Optional<String> sort) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(3);
        String sortField = sort.orElse("ngayDangKy");
        Page<DuAn> duAns = duAnService.findAll(PageRequest.of(currentPage - 1, pageSize, Sort.by(sortField).descending()));
        int totalPages = duAns.getTotalPages();
        model.addAttribute("duan", duAns);
        if (totalPages > 1) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
            model.addAttribute("pageNumber", pageNumbers);
        }
        return "duan/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("duan", new DuAn());
        return "duan/create";
    }

    @PostMapping("create")
    public String addNew(@Valid @ModelAttribute("duan") DuAn duAn, BindingResult bindingResult, RedirectAttributes attributes) {
        validate.validate(duAn,bindingResult);
        if (bindingResult.hasErrors()) {
            return "/duan/create";
        }
        duAnService.addNew(duAn);
        attributes.addFlashAttribute("msg" ,"bạn Thêm mới thành công");
        return "redirect:/duan";
    }

    @GetMapping("/{id}/edit")
    public String update(@PathVariable String id, Model model) {
        DuAn duAn = duAnService.findById(id);
        model.addAttribute("duan", duAn);
        return "duan/update";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("duan") DuAn duAn, BindingResult bindingResult, RedirectAttributes attributes) {
        if (bindingResult.hasErrors()) {
            return "/duan/update";
        }
        duAnService.update(duAn);
        attributes.addFlashAttribute("msg", "Bạn Update thành công");
        return "redirect:/duan";
    }

    @GetMapping("/{id}/delete")
    public String delete(DuAn duAn, RedirectAttributes attributes) {
        duAnService.delete(duAn.getMaDuAn());
        attributes.addFlashAttribute("msg", "Bạn Delete thành công");
        return "redirect:/duan";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable("id") String id,Model model){
        model.addAttribute("duan",duAnService.findByClassId(id));
        return "duan/list";
    }

    @GetMapping("/search")
    public String search(@RequestParam("searchAll") String search, Model model) {
        List<DuAn> duAns = duAnService.searchAll(search, search);
        model.addAttribute("duan", duAns);
        return "duan/list";
    }

}
