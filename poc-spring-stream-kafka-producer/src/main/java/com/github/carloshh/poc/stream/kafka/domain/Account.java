package com.github.carloshh.poc.stream.kafka.domain;

import java.util.UUID;

public final class Account {
	private final UUID uuid;
	private final String email;

	public Account(UUID uuid, String email) {
		this.uuid = uuid;
		this.email = email;
	}

	public UUID getUuid() {
		return uuid;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Account{" +
				"uuid=" + uuid +
				", email='" + email + '\'' +
				'}';
	}
}
