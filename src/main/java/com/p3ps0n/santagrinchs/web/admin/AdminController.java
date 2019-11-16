package com.p3ps0n.santagrinchs.web.admin;


import com.p3ps0n.santagrinchs.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("")
    public String index() { return "admin/index"; }

}
