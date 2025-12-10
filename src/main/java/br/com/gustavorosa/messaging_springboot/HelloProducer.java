package br.com.gustavorosa.messaging_springboot;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class HelloProducer {
	
	// Send events to Kafka 
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public HelloProducer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	/**
	 * Use to send a message using Kafka Template
	 * @param message
	 */
	public void sendMessage(String message) {
		kafkaTemplate.send("hello-topic", message);
	}

}
