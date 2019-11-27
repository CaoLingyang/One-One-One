package com.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Configuration
//@ComponentScans({
//        @ComponentScan("com.aop.LogAspect"),
//        @ComponentScan("com.service.impl.EmployeeServiceImpl")
//})
//@Component
//@Aspect
//public class LogAspect {
//    @Pointcut("execution(* com.service..*.*(..))")
//    public void myPointcut(){
//
//    }
//    @Before("myPointcut()")
//    public void before(){
//        System.out.println("before****");
//    }
//
////    @Bean
////    public org.apache.ibatis.session.Configuration configuration{
////
////    }
//}
