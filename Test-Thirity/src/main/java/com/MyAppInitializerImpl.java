package com;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class MyAppInitializerImpl implements MyAppInitializer{
    @Override
    public void dangQiDongShi(ServletContext sc) {
        ServletRegistration.Dynamic servletRegistration=
                sc.addServlet("xxx",new FirstServlet());
        servletRegistration.addMapping("/first");
    }
}
