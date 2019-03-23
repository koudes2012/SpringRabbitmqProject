package com.junyu.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduceService {
	@Autowired
	private AmqpTemplate amqpTemplate;

	public void sendQueue(String exchange_key, String queue_key, Object object) {
		// convertAndSend convert Java object to message, and send to message
		// queue by exchange key and queue key
		amqpTemplate.convertAndSend(exchange_key, queue_key, object);
	}
}
