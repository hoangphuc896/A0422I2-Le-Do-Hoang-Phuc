package com.example.photo_of_day.controler;

import com.example.photo_of_day.entity.Evaluate;
import com.example.photo_of_day.service.PhotoDayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/photo")
public class PhotoDayController {

    @Autowired
    PhotoDayServiceImpl photoDayService;

    @GetMapping("")
    public String listpaging(Model model, @RequestParam("page") Optional<Integer> page,
                             @RequestParam("size") Optional<Integer> size,
                             @RequestParam("sort") Optional<String> sort) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(2);
        String sortField = sort.orElse("numberOfLikes");
//        Sort sortBy = Sort.by("email").descending().and(Sort.by("phoneNumber").ascending());
        Page<Evaluate> evaluates = photoDayService.findAllWithPaging(PageRequest.of(currentPage - 1, pageSize, Sort.by(sortField).descending()));
        model.addAttribute("evaluates", evaluates);
        model.addAttribute("evaluate", new Evaluate());
        int totalPages = evaluates.getTotalPages();
        if (totalPages > 1) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "photo/home";
    }

    @PostMapping("/evaluate")
    public String submitForm(@ModelAttribute("evaluate") Evaluate evaluate) {
        photoDayService.save(evaluate);
        return "redirect:/photo";
    }

    @GetMapping("/like/{id}")
    public String like(@PathVariable("id") int id) {
        Evaluate evaluate = photoDayService.findById(id);
        evaluate.setNumberOfLikes(evaluate.getNumberOfLikes()+1);
        photoDayService.update(evaluate);
        return "redirect:/photo";
    }
}
