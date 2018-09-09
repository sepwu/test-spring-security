package com.srcgo.test.springsecurity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

	@RequestMapping("/")
	public String test() {
	    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	    authentication.getPrincipal();
	    logger.debug(authentication.toString());
	    
		return "test";
	}
}
