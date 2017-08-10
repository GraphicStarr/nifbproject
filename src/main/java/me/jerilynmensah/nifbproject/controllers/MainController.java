package me.jerilynmensah.nifbproject.controllers;


import me.jerilynmensah.nifbproject.models.NumberForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MainController {
    @GetMapping("/")
    public String showIndex(Model model)
    {
        model.addAttribute("index");
    }
        return "index";

    @PostMapping("/numberform")
    public String showNumberForm(@Valid @ModelAttribute("numberform")NumberForm, numberForm, BindingResult result)
    {
        if(result.hasErrors())
        {
            return "numberform";
        }
         return "numberconfirm";
    }
}
