package com.example.controller;

import com.example.model.Dictionary;
import com.example.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {

    @Autowired
    private DictionaryService dictionaryService;

    @GetMapping("list")
    public String displaydictionary(){
        return "list";
    }

    @PostMapping("list")
    public String displaylist(@RequestParam String vn , Model model){
        String result =dictionaryService.searchString(vn);
        Dictionary dictionary = new Dictionary(vn , result);
        model.addAttribute("result",dictionary);
        return "list";
    }
}
