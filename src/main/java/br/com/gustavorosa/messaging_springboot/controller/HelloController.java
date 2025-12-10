package br.com.gustavorosa.messaging_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gustavorosa.messaging_springboot.HelloProducer;

@RestController
@RequestMapping("/kafka")
public class HelloController {
	
	private HelloProducer helloProducerService;

	public HelloController(HelloProducer helloProducerService) {
		this.helloProducerService = helloProducerService;
	}
	
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name) {
		helloProducerService.sendMessage(name);
		return "OK";
	}
	
	
	
	

}
