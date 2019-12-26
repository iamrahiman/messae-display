package com.message.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	@RequestMapping("/")
	public String printMsg() {
		return "OK";
	}

}
