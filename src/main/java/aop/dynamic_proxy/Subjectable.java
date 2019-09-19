package aop.dynamic_proxy;

import aop.static_proxy.Subject;

import java.lang.reflect.Proxy;

/**
 * @Author: fnbory
 * @Date: 2019/9/19 16:24
 */
public class Subjectable implements Subject {

    @Override
    public int request(int i) {
        return i;
    }

    public static void main(String[] args) {
        ISubject subject=(ISubject) Proxy.newProxyInstance(MyInvocationHandler.class.getClassLoader(),new Class[]{ISubject.class},
                new MyInvocationHandler(new Subjectable()));
        System.out.println(subject.request(5));
    }
}
