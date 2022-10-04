package org.sei.utils.kafka.service;

import org.sei.utils.kafka.service.messages.CreateKafkaMessageRequest;
import org.sei.utils.kafka.service.messages.CreateKafkaMessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka-utils")
public class KafkaUtilsController {
	
	@Autowired
    KafkaUtilsService kafkaUtilsService;
	
	@PostMapping("/kafka-messages")
	public ResponseEntity<CreateKafkaMessageResponse> createKafkaMessage( @RequestBody CreateKafkaMessageRequest createKafkaMessageRequest) {
		CreateKafkaMessageResponse createKafkaMessageResponse = kafkaUtilsService.createKafkaMessage(createKafkaMessageRequest);
        return new ResponseEntity<>(createKafkaMessageResponse, HttpStatus.CREATED);
    }
	
}
