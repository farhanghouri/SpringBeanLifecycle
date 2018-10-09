package com.journaldev.spring.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
// 3rd approach

//Spring framework also support @PostConstruct and @PreDestroy annotations 
//for defining post-init and pre-destroy methods.
public class MyService {

	@PostConstruct
	public void init(){
		System.out.println("MyService init method called");
	}
	
	public MyService(){
		System.out.println("MyService no-args constructor called");
	}
	
	@PreDestroy
	public void destory(){
		System.out.println("MyService destroy method called");
	}
}
