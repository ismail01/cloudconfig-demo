package com.example.configdemo;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.Ordered;

@Configuration
@Import({DataSourceAutoConfiguration.class, JdbcTemplateAutoConfiguration.class})
public class MyBootstrapConfiguration implements Ordered{

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
