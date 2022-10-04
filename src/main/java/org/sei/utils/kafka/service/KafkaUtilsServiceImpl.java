package org.sei.utils.kafka.service;

import org.sei.utils.kafka.KafkaProducer;
import org.sei.utils.kafka.service.messages.CreateKafkaMessageRequest;
import org.sei.utils.kafka.service.messages.CreateKafkaMessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KafkaUtilsServiceImpl implements KafkaUtilsService{

	@Autowired
	KafkaProducer kafkaProducer;
	
	@Override
	public CreateKafkaMessageResponse createKafkaMessage(CreateKafkaMessageRequest createKafkaMessageRequest) {
		return new CreateKafkaMessageResponse(
					kafkaProducer.sendMessage(
								createKafkaMessageRequest.getTopic(),createKafkaMessageRequest.getMessage().toPrettyString()
					)
				);
	}

}
