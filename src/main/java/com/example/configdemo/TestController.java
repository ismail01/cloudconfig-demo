package com.example.configdemo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
@RefreshScope
public class TestController {

	@Value("${name}")
	private String name;
	
	@Autowired
	private Environment env;
	
	@PostConstruct
    public String getValue() 
    {
		System.out.println(env.getProperty("name"));
		System.out.println(env.getActiveProfiles()[0]);
		System.out.println("name:::"+name);
		return env.getProperty("name");
    }

}
