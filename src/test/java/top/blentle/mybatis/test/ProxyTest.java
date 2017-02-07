package top.blentle.mybatis.test;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.lang.reflect.Proxy;

/**
 * Created by blentle on 2017/2/4.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Subject subjectImpl = new SubjectImpl();
//        Subject subject = new SubjectProxy(subjectImpl);
//        subject.sayHi("renhuan");
//        subject.sayHello("blentle");
        Subject subject = (Subject)Proxy.newProxyInstance(subjectImpl.getClass().getClassLoader(),subjectImpl.getClass().getInterfaces(),new SubjectProxyInvocationHandler(subjectImpl));
        subject.sayHi("renhuan");
        subject.sayHello("renhuan");
    }
}
