package org.sei.utils.kafka;


import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public String sendMessage(String topic, String message) {
		try {
			return kafkaTemplate.send(topic, message).get().getRecordMetadata().toString().split("@")[1];
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
	}
	
}
