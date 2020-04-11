package com.alexbelke.springandreactdatarest.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/") // it will map to src/main/resources/templates/index.html
	public String index() {
		return "index";
	}

}
