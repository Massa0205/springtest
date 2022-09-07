package com.example.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.web.service.ReportTypeService;
import com.example.web.service.UserService;


@Controller
public class IndexController {

    @Autowired
    UserService userService;

    @Autowired
    ReportTypeService reportTypeService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model){
        /**
         * トップ画面へ
         */
        model.addAttribute("reportType", reportTypeService.getAllType());
        return "index";
    }
}