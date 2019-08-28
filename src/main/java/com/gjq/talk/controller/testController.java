package com.gjq.talk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;import sun.tools.tree.ThisExpression;

@RestController
public class testController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@RequestMapping("/hello")
	public String sayHello(){
		logger.info("hello word");
		return "hello,word";
	}

}
