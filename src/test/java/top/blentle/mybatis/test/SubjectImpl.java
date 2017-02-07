package top.blentle.mybatis.test;

/**
 * Created by blentle on 2017/2/4.
 */
public class SubjectImpl implements Subject {
    @Override
    public void sayHi(String name) {
        System.err.println("hi:" + name);
    }

    @Override
    public void sayHello(String name) {
        System.err.println("hello:" + name);
    }
}
