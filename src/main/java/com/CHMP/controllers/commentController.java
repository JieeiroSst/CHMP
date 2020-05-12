package com.CHMP.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.CHMP.services.commentService;
import com.CHMP.DTO.comment;

@RestController
@RequestMapping("CHMP")
public class commentController {
    @Autowired
    private commentService service;

    @RequestMapping("/comment")
    public String viewPage(Model model){
        List<comment> comments=service.listAll();
        model.addAttribute("comment",comments);
        return "comment";
    }

    @RequestMapping("/comment/newComment")
    public String showNewCommentForm(Model model){
        comment comments=new comment();
        model.addAttribute("comment",comments);
        return "comment/newComment";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String saveComment(@ModelAttribute("comment")comment c){
        service.save(c);
        return "redirect:/";
    }

    @RequestMapping("/comment/edit/{id}")
    public ModelAndView showEditCommentForm(@PathVariable("id")Integer id){
        ModelAndView modelAndView=new ModelAndView("comment/editComment");
        comment c=service.get(id);
        modelAndView.addObject(c);
        return modelAndView;
    }

    @RequestMapping("/comment/delete/{id}")
    public String deleteComment(@PathVariable("id") Integer id){
        service.deleteID(id);

        return "redirect:/";
    }
}
