package com.yash.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.dev.service.LazyService;

/**
 * Created by Yashwanth Anand S
 **/

@RestController
@RequestMapping("/lazy")
public class LazyController {

	@Lazy
	@Autowired
	LazyService lazyService;

	@GetMapping
	public String hello() {
		return lazyService.hello();
	}

}
