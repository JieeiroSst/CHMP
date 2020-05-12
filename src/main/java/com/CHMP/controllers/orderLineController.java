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

    @RequestMapping("/orderLine")
    public String showPage(Model model){
        List<orderLine> orderLines=service.listAll();
        model.addAttribute("orderLine");

        return "orderLine";
    }

    @RequestMapping("/orderLine/newOrderLine")
    public String ShowNewOrderLine(Model model){
        orderLine orderLine=new orderLine();
        model.addAttribute("orderLine",orderLine);

        return "orderLine/newOrderLine";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(@ModelAttribute("orderLine")orderLine orderLine){
        service.save(orderLine);

        return "redirect:/";
    }

    @RequestMapping("/orderLine/edit/{id}")
    public ModelAndView showEditOrderLineForm(@PathVariable(name = "id")Integer id){
        ModelAndView modelAndView=new ModelAndView("orderLine/editOderLine");
        orderLine orderLine=service.get(id);

        return modelAndView;
    }

    @RequestMapping("/orderLine/delete/{id}")
    public String deleteOrderLine(@PathVariable(name = "id")Integer id){
        service.deleteID(id);

        return "redirect:/";
    }
}
