package com.streamkafaka.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString

public class Greetings {

    private long timestamp;
    private String message;
}
