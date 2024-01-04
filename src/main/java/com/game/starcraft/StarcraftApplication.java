package com.game.starcraft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class StarcraftApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarcraftApplication.class, args);
    }
}
