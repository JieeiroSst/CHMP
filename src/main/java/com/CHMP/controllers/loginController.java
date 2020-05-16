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
@RequestMapping("CHMP")
public class loginController {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String ShowLogin(Model model){

        return "login";
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String HandleLogin(@RequestParam(name = "name") String name,@RequestParam(name = "password")String password){

        return "";
    }
}
