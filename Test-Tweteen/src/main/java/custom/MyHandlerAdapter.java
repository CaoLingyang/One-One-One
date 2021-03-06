package custom;

import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

public class MyHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return handler.getClass().isAnnotationPresent(MvcController.class);
    }

    @Override
    public ModelAndView handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws Exception {
        Method method=handler.getClass()
                .getDeclaredMethod("process",HttpServletRequest.class,HttpServletRequest.class);
        ModelAndView mav= (ModelAndView) method.invoke(handler,httpServletRequest,httpServletResponse);
        return mav;
    }

    @Override
    public long getLastModified(HttpServletRequest httpServletRequest, Object handler) {
        return 0;
    }
}
