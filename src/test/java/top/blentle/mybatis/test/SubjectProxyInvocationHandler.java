package top.blentle.mybatis.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by blentle on 2017/2/4.
 */
public class SubjectProxyInvocationHandler implements InvocationHandler {

    private Subject target;

    public SubjectProxyInvocationHandler(Subject target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.print("say:");
        return method.invoke(target,args);
    }
}
