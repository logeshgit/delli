package com.delli.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class DelliConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DelliConsumerApplication.class, args);
	}

}
