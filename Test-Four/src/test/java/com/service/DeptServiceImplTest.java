package com.service;

import com.config.simple.SimpleConfig;
import com.service.impl.EmployeeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DeptServiceImplTest {
    @Test
    public void testDeptInsert(){
        ApplicationContext context=new AnnotationConfigApplicationContext(SimpleConfig.class);
        EmployeeServiceImpl employeeServiceImpl = context.getBean("employeeServiceImpl", EmployeeServiceImpl.class);
        employeeServiceImpl.demo();
    }
}
