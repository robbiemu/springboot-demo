package com.cooksys.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Autowired
	DemoService service;
	
	@RequestMapping("/hello")
	String getHello() {
		return service.hello ();
	}

	@RequestMapping(value="/echo", method=RequestMethod.POST)
	String postEcho(@RequestBody String html) {
		return service.echo (html);
	}
	
}
