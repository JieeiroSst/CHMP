package com.CHMP.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import com.CHMP.services.commentService;
import com.CHMP.DTO.comment;

@RestController
public class commentController {
    @Autowired
    private commentService service;

}
