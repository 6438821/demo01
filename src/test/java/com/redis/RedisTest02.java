package com.redis;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext-redis.xml")
public class RedisTest02 {

    @Test
    public void RedisContext() {
        ClassPathXmlApplicationContext ApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext-redis.xml");
        System.out.println(ApplicationContext);
    }
}
