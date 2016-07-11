package com.cooksys.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

	@Autowired
	DemoRepository repository;
	
	public String hello() {
		// process logic around getting repository result
		String result = repository.readHello();
		// process logic around result data-set, such as:
		result = wrap_in_html(result);
		return result;		
	}

	private String wrap_in_html(String result) {
		// this could be replaced with @ResponseBody
		return "<!DOCTYPE html><html><head><title>Springboot demo - dynamic html response</title></head><body>"+result+"</body></html>";
	}

	public String echo(String snippet) {
		// TODO Auto-generated method stub
		return wrap_in_html(snippet);
	}

}
