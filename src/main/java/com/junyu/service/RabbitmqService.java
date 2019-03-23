package com.junyu.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class RabbitmqService implements MessageListener {
	
    public void onMessage(Message message) {
        System.out.println("message consumer = " + message.toString());
    }
    
}
