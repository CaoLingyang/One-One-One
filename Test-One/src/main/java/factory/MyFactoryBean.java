package factory;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<A> {

    public boolean isSingleton() {
        return true;
    }


    public A getObject() throws Exception {
        return new A();
    }


    public Class<?> getObjectType() {
        return A.class;
    }
}
