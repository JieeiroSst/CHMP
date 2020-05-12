package com.CHMP.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.CHMP.DTO.customer;
import com.CHMP.services.customerService;

@Controller
@RequestMapping("/CHMP")
public class customerController {
    @Autowired
    private customerService service;

    @RequestMapping("/comment")
    public String viewPage(Model model){

        return "";
    }
}
