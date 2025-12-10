package br.com.gustavorosa.messaging_springboot;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class HelloConsumer {
	
	/**
	 * Method used to receive a message
	 * topics => Name of topic to connect a producer
	 * groupId => Used to identify one consumer in a list of consumers
	 * 
	 * @param message
	 */
	@KafkaListener(topics = "hello-topic", groupId = "group-1")
	public void receiveMessage(String message) {
		System.out.println("Received message: " + message);
	}

}
