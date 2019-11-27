package com.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/view")
public class ViewDemoController {

    @RequestMapping("/demo1")
    public String demo1(){
       return "view";
    }

    @RequestMapping("/demo2")
    public String demo2(HttpServletRequest request){
        request.setAttribute("a","sadf");
        return "forward:view";
    }

    @RequestMapping("/demo3")
    public ModelAndView demo3(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("view");
        return mav;
    }

    @RequestMapping("/demo4")
    public String demo4(HttpServletRequest request){
        request.setAttribute("f","sadf");
        return "redirect:dis";
    }

    @RequestMapping("/demo5")
    public RedirectView demo5(){
        RedirectView rv=new RedirectView("dis");
        return rv;
    }

    @RequestMapping("/dis")
    public String demo11(){
        return "view";
    }
}
