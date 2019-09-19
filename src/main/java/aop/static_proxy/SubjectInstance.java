package aop.static_proxy;

/**
 * 静态代理的被代理类
 * @Author: fnbory
 * @Date: 2019/9/19 14:02
 */
public class SubjectInstance implements Subject {

    @Override
    public int request(int i) {
        return i;
    }
}
