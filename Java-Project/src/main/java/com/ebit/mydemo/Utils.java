package com.ebit.mydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@PropertySource("classpath:error.properties")
@Component
public class Utils {

	@Autowired
	private Environment env;
	
	public String getProperty(String key) {
		return env.getProperty(key);
	}
}
