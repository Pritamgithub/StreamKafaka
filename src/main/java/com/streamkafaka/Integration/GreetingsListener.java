package com.streamkafaka.Integration;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.streamkafaka.main.GreetingsStreams;
import com.streamkafaka.model.Greetings;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class GreetingsListener {
    @StreamListener(GreetingsStreams.INPUT)
    public void handleGreetings(@Payload Greetings greetings) {
	log.info(" Received Greetings: {} ", greetings);
    }
}
