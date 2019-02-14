package com.lendingclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PrimeUrlController {

	@RequestMapping()
	public String init() {

		return "index.html";
	}
}
