package com.p3ps0n.santagrinchs.web.login.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

}