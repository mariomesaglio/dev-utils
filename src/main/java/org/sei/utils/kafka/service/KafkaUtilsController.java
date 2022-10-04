package org.sei.utils.kafka.service;

import org.sei.utils.kafka.KafkaProducer;
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
	
	@Autowired
	KafkaProducer kafkaProducer;
	
	@PostMapping("/kafka-messages")
	public ResponseEntity<CreateKafkaMessageResponse> createKafkaMessage( @RequestBody String message) {
		CreateKafkaMessageResponse createKafkaMessageResponse = new CreateKafkaMessageResponse(kafkaProducer.sendMessage("quickstart-events",message));
        return new ResponseEntity<>(createKafkaMessageResponse, HttpStatus.CREATED);
    }
	
}
