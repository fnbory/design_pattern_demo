package aop.dynamic_proxy;

import java.lang.reflect.Proxy;

/**
 * @Author: fnbory
 * @Date: 2019/9/19 16:18
 */
public class Requestable implements  IRequestable {
    @Override
    public int request(int i) {
        return i;
    }

    public static void main(String[] args) {
        IRequestable requestable= (IRequestable) Proxy.newProxyInstance(MyInvocationHandler.class.getClassLoader(),
                new Class[]{IRequestable.class},new MyInvocationHandler(new Requestable()));
        System.out.println(requestable.request(3));
    }
}
