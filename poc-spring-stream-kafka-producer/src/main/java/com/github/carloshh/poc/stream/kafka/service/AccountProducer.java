package com.github.carloshh.poc.stream.kafka.service;

import com.github.carloshh.poc.stream.kafka.domain.Account;
import com.github.javafaker.Faker;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class AccountProducer {
	private final MessageChannel accountMessageChannel;

	public AccountProducer(MessageChannel accountMessageChannel) {
		this.accountMessageChannel = accountMessageChannel;
	}

	@Scheduled(fixedDelay = 1_000)
	public void accountProducer() {
		var faker = new Faker();
		var account = new Account(UUID.randomUUID(), faker.internet().emailAddress());

		accountMessageChannel.send(MessageBuilder.withPayload(account).build());
	}

}
