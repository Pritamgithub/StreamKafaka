package com.streamkafaka.main;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface GreetingsStreams {
//during runtime Spring will create a Java Proxy based Implementation of the GreetingsStreams Interface
// that can be injected as Spring Bean anywhere in code to access our two stream
    String INPUT = "greetings-in";
    String OUTPUT = "greetings-out";

    @Input(INPUT)
    SubscribableChannel inboundGreetings();// method defines to inbound stream to read from kafka topic
    
    @Output(OUTPUT)
    MessageChannel outboundGreetings();// method defines to outbound stream write to kafka topic
    

}
