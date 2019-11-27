package com.controller.passdatatoview;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/redirect")
public class RedirectPassController {
    @GetMapping("/demo1")
    public String demo1(HttpSession session){
        session.setAttribute("f","/forward/demo1");
        return "redirect:demo12";
    }

    @GetMapping("/demo12")
    public String demo12(){
        return "view";
    }

    @GetMapping("/demo21")
    public String demo21(){
        return "redirect:demo22?f=redirect-demo21";
    }

    @GetMapping("/demo22")
    public String demo22(String f, Model model){
        model.addAttribute("f",f);
        return "view";
    }

    @GetMapping("/demo31")
    public String demo31(RedirectAttributes redirectAttributes){
        redirectAttributes.addAttribute("f1","demo31 f1");
        redirectAttributes.addFlashAttribute("f","demo3-flash");
        return "redirect:demo32";
    }

    @GetMapping("/demo32")
    public String demo32(String f1, Model model){
        return "view";
    }

    @GetMapping("/demo33")
    public String demo33(){
        return "view";
    }
}
