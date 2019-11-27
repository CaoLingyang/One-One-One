package com.controller.passdatatoview;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/forward")
public class ForwardPassController {
    @GetMapping("/demo1")
    public String demo(HttpServletRequest request){
        request.setAttribute("f","/forward/demo1");
        return "view";
    }

    @GetMapping("/demo2")
    public ModelAndView demo2(){
        ModelAndView mav=new ModelAndView();
        mav.addObject("f","/forward/demo2");
        mav.setViewName("view");
        return mav;
    }


    @GetMapping("/demo3")
    public String demo3(Model model){
        model.addAttribute("f","/forward/demo3");
        return "view";
    }
}
