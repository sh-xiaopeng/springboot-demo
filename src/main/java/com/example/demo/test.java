package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
	/**
	 * @author yangpengcheng
	 * @date 20180706
	 * @return
	 */
	@RequestMapping("/hello")
	public String hello(){
		return "Spring boot!!!!";
	}
}
