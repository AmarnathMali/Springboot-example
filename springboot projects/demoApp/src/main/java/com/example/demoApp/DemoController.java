package com.example.demoApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class DemoController {

	@RequestMapping("/wel")
	public String view(){
		return "welcome Amar!!";
	}
}
