package com.streamkafaka.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.streamkafaka.main.GreetingsStreams;

@EnableBinding(GreetingsStreams.class)
//Binding the streams is done by @EnableBinding and we pass the streams class
public class StreamConfig {


}
