package top.blentle.mybatis.test;

/**
 * Created by blentle on 2017/2/4.
 */
public class SubjectProxy implements Subject {

    private Subject target;

    public SubjectProxy(Subject target) {
        this.target = target;
    }

    @Override
    public void sayHi(String name) {
        System.out.print("say:");
        target.sayHi(name);
    }

    @Override
    public void sayHello(String name) {
        System.out.print("say:");
        target.sayHello(name);
    }
}
