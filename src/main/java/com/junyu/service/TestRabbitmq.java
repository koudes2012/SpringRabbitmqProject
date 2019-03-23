package com.junyu.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRabbitmq {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		ProduceService messageProducer = (ProduceService) context.getBean("produceService");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", "hello rabbitmq");
		messageProducer.sendQueue("test_mq_exchange", "test_mq_patt", map);
	}
}
