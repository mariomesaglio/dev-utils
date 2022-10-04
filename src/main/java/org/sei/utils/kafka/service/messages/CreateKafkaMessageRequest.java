package org.sei.utils.kafka.service.messages;

import com.fasterxml.jackson.databind.JsonNode;

public class CreateKafkaMessageRequest {

	private String topic;
	private JsonNode message;
	
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public JsonNode getMessage() {
		return message;
	}
	public void setMessage(JsonNode message) {
		this.message = message;
	}
	
}
