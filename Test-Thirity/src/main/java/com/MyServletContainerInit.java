package com;


import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

@HandlesTypes(MyAppInitializer.class)
public class MyServletContainerInit implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> clazzes, ServletContext ctx) throws ServletException {
        for (Class<?>clz:clazzes){
            if (MyAppInitializer.class.isAssignableFrom(clz)) {

                try {
                    MyAppInitializer instance= (MyAppInitializer) clz.newInstance();
                    instance.dangQiDongShi(ctx);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
