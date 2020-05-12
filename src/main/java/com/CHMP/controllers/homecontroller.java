package com.CHMP.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("CHMP")
public class homecontroller {
    @RequestMapping("/home")
    public String ShowPageHome(Model model){
        return "index";
    }
}
