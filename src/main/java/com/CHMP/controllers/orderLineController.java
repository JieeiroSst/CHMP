package com.CHMP.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.CHMP.DTO.orderLine;
import com.CHMP.services.orderLineService;

@Controller
@RequestMapping("CHMP")
public class orderLineController {
    @Autowired
    private orderLineService service;

}
