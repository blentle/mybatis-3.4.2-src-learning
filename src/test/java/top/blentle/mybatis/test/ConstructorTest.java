package top.blentle.mybatis.test;

import static org.junit.Assert.*;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * Created by blentle on 2017/2/3.
 */
public class ConstructorTest {
    @Test
    public void testConstructor() {
        try {
            Class<DefaultObjectFactory> clazz = DefaultObjectFactory.class;
            Constructor<DefaultObjectFactory> constructor = clazz.getConstructor();
            DefaultObjectFactory instance = constructor.newInstance();
            assertNotNull(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
