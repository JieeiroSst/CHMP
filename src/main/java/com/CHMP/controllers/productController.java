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

    @RequestMapping("product")
    public String ShowPage(Model model){
        List<product> products=service.listAll();
        model.addAttribute("product",products);

        return "product";
    }

    @RequestMapping("product/newProduct")
    public String ShowNewProduct(Model model){
        product product=new product();
        model.addAttribute("product",product);

        return "product/newProduct";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product")product product){
        service.save(product);

        return "redirect:/";
    }

    @RequestMapping("/product/edit/{id}")
    public ModelAndView showEditProduct(@PathVariable(name = "id")Integer id){
        ModelAndView modelAndView=new ModelAndView("product/editProduct");

        product product=new product();
        modelAndView.addObject("product",product);

        return modelAndView;
    }

    @RequestMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable(name = "id")Integer id){
        service.deleteID(id);
        return "redirect:/";
    }

}
