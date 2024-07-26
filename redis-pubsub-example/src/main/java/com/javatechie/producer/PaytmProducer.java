package com.javatechie.producer;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javatechie.dto.PaymentRequest;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PaytmProducer {
	

	private ChannelTopic channelTopic;
	
	private StringRedisTemplate redisTemplate;
	
	public String doTransaction(PaymentRequest paymentRequest) {
		try{redisTemplate.convertAndSend(channelTopic.getTopic(), new ObjectMapper().writeValueAsString(paymentRequest));
		
	}catch  (JsonProcessingException e) {
		e.printStackTrace();
	}
return "payment request initiated...";
}
}