package org.sei.utils.kafka.service;

public class CreateKafkaMessageResponse {

	private String offset;

	public CreateKafkaMessageResponse(String offset) {
		this.offset = offset;
	}
	
	public String getOutcome() {
		return offset;
	}

	public void setOutcome(String offset) {
		this.offset = offset;
	}
	
}
