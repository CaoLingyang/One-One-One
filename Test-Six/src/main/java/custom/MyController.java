package custom;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyController {

    public ModelAndView process(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("");
        modelAndView.addObject("msg","custom");
        return modelAndView;
    }
}
