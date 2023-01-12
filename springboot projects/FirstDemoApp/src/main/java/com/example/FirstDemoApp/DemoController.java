package com.example.FirstDemoApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class DemoController {
	
	@RequestMapping("/test")
	public String display(){
		return "welcome to of spring boot";
	}

}
