package com.ebit.mydemo;

import java.text.MessageFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	Utils utils;
	
	
	@GetMapping("/hello")
	public String getMessage(@RequestParam String key) {
		String channelId="600";
		log.debug("one");
		log.warn("one");
		log.info("one");
		log.debug(MessageFormat.format("Error while creating channel Id:{0}",channelId));
		log.warn(MessageFormat.format("Error while creating channel Id:{0}",channelId));
		log.info(MessageFormat.format("Error while creating channel Id:{0}",channelId));
		log.error(MessageFormat.format("Error while creating channel Id:{0}",channelId));
		return MessageFormat.format(utils.getProperty(key),500,100);
	}

}
