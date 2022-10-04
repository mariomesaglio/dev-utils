package org.sei.utils.kafka.service.messages;

public class CreateKafkaMessageResponse {

	private String offset;

	public CreateKafkaMessageResponse(String offset) {
		this.offset = offset;
	}
	
	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}
	
}
