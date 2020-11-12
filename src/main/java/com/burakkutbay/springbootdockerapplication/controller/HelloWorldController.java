package com.burakkutbay.springbootdockerapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/")
	public String index() {
		return "Merhaba Dünya https://blog.burakkutbay.com";
	}
}
