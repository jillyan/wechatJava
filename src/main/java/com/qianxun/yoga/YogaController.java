package com.qianxun.yoga;

import javax.ws.rs.POST;

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
	
	@POST
	@RequestMapping(value="/applyOff")
	public String applyOff(String name){
		YogaDao.applyOff(name);
		System.out.println("Hello "+name+"!");
		return "success!";
	}
}
