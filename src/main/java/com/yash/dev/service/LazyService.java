package com.yash.dev.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Created by Yashwanth Anand S
 **/

@Lazy
@Service
public class LazyService {

	public LazyService() {
		System.out.println("Lazy Service: constrator Loaded");
	}

	public String hello() {
		return "hello Youtube!!";
	}

}
