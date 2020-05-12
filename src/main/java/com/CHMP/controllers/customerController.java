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

    @RequestMapping("/customer")
    public String viewPage(Model model){
        List<customer> customers= service.listAll();
        model.addAttribute("customer",customers);
        return "customer";
    }

    @RequestMapping("/customer/newCustomer")
    public String showCustomerForm(Model model){
        customer customer=new customer();
        model.addAttribute("customer",customer);

        return "customer/newCustomer";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(@ModelAttribute("customer")customer customer){
        service.save(customer);

        return "redirect:/";
    }

    @RequestMapping("/customer/edit/{id}")
    public ModelAndView showEditCustomerForm(@PathVariable(name = "id")Integer id){
        ModelAndView modelAndView=new ModelAndView("customer/editCustomer");

        customer customer=service.get(id);

        modelAndView.addObject("customer",customer);

        return modelAndView;
    }

    @RequestMapping("customer/delete/{id}")
    public String deleteCustomer(@PathVariable(name = "id")Integer id){
        service.deleteID(id);

        return "redirect:/";
    }
}
