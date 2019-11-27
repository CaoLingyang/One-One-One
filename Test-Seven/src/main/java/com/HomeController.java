package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/a")
@Controller
public class HomeController {
    @RequestMapping("/aaaa")
    public String index(){
        return "index";
    }
}
