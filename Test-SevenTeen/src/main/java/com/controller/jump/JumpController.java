package com.controller.jump;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/jump")
public class JumpController {
    @RequestMapping("/demo1")
    public String demo1(){
        return "forward:demo2";
    }
    @RequestMapping("/demo2")
    public String demo2(){
        return "view";
    }

    @Deprecated
    @RequestMapping("/demo3")
    public String demo3(){
        return "forward:/WEB-INF/views/view.jsp";
    }

    @RequestMapping("/demo4")
    public String demo4(){
        return "redirect:dis";
    }

    @RequestMapping("/demo5")
    public RedirectView demo5(){
        RedirectView rv=new RedirectView("dis");
        return rv;
    }

    @RequestMapping("/demo6")
    @Deprecated
    public String demo6(){
        return "redirect:/myview.jsp";
    }

    @RequestMapping("/dis")
    @Deprecated
    public RedirectView demo7(){
        RedirectView rv=new RedirectView("/myview.sjp");
        return rv;
    }
    @RequestMapping("/dis")
    public String dis(){
        return "view";
    }
}
