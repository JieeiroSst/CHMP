package com.CHMP.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.CHMP.services.orderDetailService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.CHMP.DTO.orderDetail;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/CHMP")
public class orderDetailController {
    @Autowired
    private orderDetailService service;

    @RequestMapping("/orderDetail")
    public String viewPage(Model model){
        List<orderDetail> orderDetails= service.listAll();
        model.addAttribute("orderDetails",orderDetails);

        return "orderDetail";
    }
    @RequestMapping("/orderDetail/newOrderDetail")
    public String showNewProductForm(Model model){
        orderDetail orderDetail=new orderDetail();
        model.addAttribute("order",orderDetail);

        return "orderDetail/newOrderDetail";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("orderDetail") orderDetail orderDetail){
        service.save(orderDetail);

        return "redirect:/";
    }

    @RequestMapping("/orderDetail/edit/{id}")
    public ModelAndView ShowEditProductForm(@PathVariable(name = "id")Integer id){
        ModelAndView mav=new ModelAndView("orderDetail/editOrderDetail");

        orderDetail orderDetail=service.get(id);
        mav.addObject("order",orderDetail);

        return mav;
    }

    @RequestMapping("/orderDetail/delete/{id}")
    public String deleteOrderDetail(@PathVariable(name = "id")Integer id){
        service.deleteID(id);

        return "redirect:/";
    }
}
