package aop.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: fnbory
 * @Date: 2019/9/19 15:55
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equals("request")){
            if(args!=null&&args.length>0&&args[0] instanceof  Integer){
                return (Integer)args[0]>10?method.invoke(object,args):0;
            }
        }
        return null;
    }
}
