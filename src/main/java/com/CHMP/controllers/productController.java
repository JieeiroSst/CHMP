package com.CHMP.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.CHMP.DTO.product;
import com.CHMP.services.productService;

@Controller
@RequestMapping("CHMP")
public class productController {
    @Autowired
    private productService service;
}
