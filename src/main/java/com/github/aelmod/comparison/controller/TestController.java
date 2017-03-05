package com.github.aelmod.comparison.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("asd")
public class TestController {
    @RequestMapping("/zalupa")
    public String indux(Model model) {
        return "zalupa";
    }
}
