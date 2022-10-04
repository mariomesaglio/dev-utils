package org.sei.utils.kafka.service;

import org.springframework.stereotype.Component;

@Component
public interface KafkaUtilsService {

	
	String createKafkaMessage(String message);
	
}
