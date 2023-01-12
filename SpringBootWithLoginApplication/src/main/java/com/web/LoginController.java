package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	
	@RequestMapping("/process")
	public String process(@RequestParam("uname") String uname, @RequestParam("pwd") String pwd,Model m) {
		if(uname.equals("admin") && pwd.equals("admin123")) {
			m.addAttribute("msg",uname);
			return "success";
		}else {
			m.addAttribute("msg",uname);
			return "fail";
		}
	}
}
