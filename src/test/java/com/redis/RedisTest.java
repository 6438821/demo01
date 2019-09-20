package com.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.types.RedisClientInfo;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext-redis.xml")
public class RedisTest {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Test
    public void testRedis(){
        //redisTemplate.opsForValue().set("刘德华","今晚死了");
        String hua = redisTemplate.opsForValue().get("刘德华");
        System.out.println(hua);
        List<RedisClientInfo> clientList = redisTemplate.getClientList();
        for (RedisClientInfo redisClientInfo : clientList) {
            System.out.println(redisClientInfo);
        }

    }
}
