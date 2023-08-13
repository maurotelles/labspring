package com.labs.labjwt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Jwt {

	@GetMapping("/jwt")
	@ResponseBody
	public String getJwt() {
		String jwt = "jwt";

		return jwt;
	}
}
