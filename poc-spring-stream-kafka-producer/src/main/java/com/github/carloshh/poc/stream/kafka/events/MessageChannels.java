package com.github.carloshh.poc.stream.kafka.events;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MessageChannels {

    @Output
    MessageChannel accountMessageChannel();

}
