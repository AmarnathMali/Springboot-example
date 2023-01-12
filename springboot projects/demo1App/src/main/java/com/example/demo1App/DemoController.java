package com.example.demo1App;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class DemoController {

	@RequestMapping("/test")
	public String display(){
		return "welcome again!!!";
	}
}
