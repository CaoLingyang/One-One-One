package custom;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@MvcController
public class MyController {
    public ModelAndView process(HttpServletResponse response, HttpServletRequest request){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/WEB-INF/jsp/custom.jsp");
        modelAndView.addObject("msg","custom");
        return modelAndView;
    }
}
