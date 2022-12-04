package com.example.corelistenerapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CoreListenerApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreListenerApiApplication.class, args);
    }

}
