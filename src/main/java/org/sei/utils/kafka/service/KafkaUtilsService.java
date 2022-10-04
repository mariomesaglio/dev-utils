package org.sei.utils.kafka.service;

import org.sei.utils.kafka.service.messages.CreateKafkaMessageRequest;
import org.sei.utils.kafka.service.messages.CreateKafkaMessageResponse;
import org.springframework.stereotype.Component;

@Component
public interface KafkaUtilsService {

	CreateKafkaMessageResponse createKafkaMessage(CreateKafkaMessageRequest createKafkaMessageRequest);
	
}
