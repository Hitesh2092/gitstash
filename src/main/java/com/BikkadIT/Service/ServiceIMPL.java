package com.BikkadIT.Service;

import org.springframework.web.bind.annotation.GetMapping;

public class ServiceIMPL implements ServiceI{

	
	@GetMapping("/welcome")
	public String Greet() {
		String msg="Hii all";
		return msg;
		
		
	}

}
