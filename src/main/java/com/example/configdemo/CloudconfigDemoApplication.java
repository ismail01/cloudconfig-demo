package com.example.configdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableConfigServer
@Slf4j
public class CloudconfigDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudconfigDemoApplication.class, args);
	}

	/*
	@Bean
    public CommandLineRunner printProperties(@Value("${name}") final String fooProperty)  {
        return args -> log.info("name", fooProperty);
    }*/
}
