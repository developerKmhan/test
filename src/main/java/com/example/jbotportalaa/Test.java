package com.example.jbotportalaa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@GetMapping("/test")
	public String test(){
		return "JBotPortalAA 사이트입니다";
	}

}
