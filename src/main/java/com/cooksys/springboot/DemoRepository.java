package com.cooksys.springboot;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {

	// this would normally be a call to a dao impl.. or it would actually *be* a dao instead of a "repository"
	public String readHello() {
		return "hello";
	}

}
