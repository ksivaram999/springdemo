package com.spring.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

	@RequestMapping("/hello")
	public String healthCheck() {
		return "Hello Sivaram";
	}
}
