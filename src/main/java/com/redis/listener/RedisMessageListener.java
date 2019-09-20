package com.redis.listener;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

/**
 * redis消息通知监听器
 */
public class RedisMessageListener implements MessageListener {

    /**
     * onMessage：处理消息
     * message：完整的消息
     * pattern：获取的频道消息
     * @param message
     * @param pattern
     */
    public void onMessage(Message message, byte[] pattern) {

        System.out.println(message.getChannel().toString()+message.getBody().toString());
    }
}
