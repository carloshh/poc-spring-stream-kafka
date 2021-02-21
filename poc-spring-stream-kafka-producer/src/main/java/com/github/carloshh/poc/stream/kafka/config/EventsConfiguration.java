package com.github.carloshh.poc.stream.kafka.config;

import com.github.carloshh.poc.stream.kafka.events.MessageChannels;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(MessageChannels.class)
public class EventsConfiguration {
}
