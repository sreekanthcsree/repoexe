package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@RequestMapping(method = RequestMethod.GET)
	public String sayHello() {
		return "Sreekanth...!Hello welcome to Bangalore";
	}
}
