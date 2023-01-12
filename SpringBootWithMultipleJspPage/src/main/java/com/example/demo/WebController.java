package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class WebController {

	@RequestMapping("/hello")
	public String view() {
		return "hello";
	}
	
	
	@RequestMapping("/discipline")
	public String display() {
		return "discipline";
	}
}
