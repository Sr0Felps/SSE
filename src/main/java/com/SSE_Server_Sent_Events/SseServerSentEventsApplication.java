package com.SSE_Server_Sent_Events;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
@SpringBootApplication
@EnableScheduling
public class SseServerSentEventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SseServerSentEventsApplication.class, args);
	}

}