package com.basak.tracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TrackController {

	@RequestMapping("/")
	public String hello() {
		return "index";
	}
	
}
