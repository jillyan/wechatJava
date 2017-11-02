package com.qianxun.yoga;

import java.text.SimpleDateFormat;
import java.util.Date;

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
	
	@RequestMapping(value="/applyOff")
	public String applyOff(String wechatNickname){
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String timeStr = sdf.format(new Date());
		System.out.println("Hello "+wechatNickname+"!");
		return "Hi "+wechatNickname+"，请假成功 （时间："+timeStr+"）!"; //显示本周请假，本月请假，本学期请假
	}
}
