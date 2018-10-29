package main.java.test;

import main.java.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 *
 */
public class ClassTest {

    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("main/resources/applicationContext.xml");
        User user = (User) ac.getBean("user");
        Assert.assertNotNull(user);
    }
}
