package com.qianxun.yoga;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/yoga")
public class YogaController {
	
	@RequestMapping(value="/hello")
	public String hello(){
		System.out.println("Hello world!");
		return "Hello world!";
	}
}
