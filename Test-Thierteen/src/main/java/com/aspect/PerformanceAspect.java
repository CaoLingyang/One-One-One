package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author cj
 * @date 2019/11/6
 */
@Component
@Aspect
@Order(50)// 调成一个比较小的数字意味着优先级更高
public class PerformanceAspect {
    @Pointcut("execution(* com.service..*.*(..))")
    public void myPointcut(){

    }
    @Around("myPointcut()")
    public Object performance(ProceedingJoinPoint joinPoint){
        Object result = null;

        try {
            Long start = System.currentTimeMillis();
            result = joinPoint.proceed();
            Long end = System.currentTimeMillis();
            System.out.println("耗时:" + (end -start));
        } catch (Throwable throwable) {
            System.out.println("-----debug: throwable.getClass().getName() = " + throwable.getClass().getName());
        }
        return result;
    }
}
