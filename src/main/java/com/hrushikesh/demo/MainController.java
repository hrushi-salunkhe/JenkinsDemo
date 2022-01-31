package com.hrushikesh.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/")
	public String get() {
		return "Jenkins is fun!";
	}

	@GetMapping("/link")
	public String getLink() {
		return "Link!";
	}
}
