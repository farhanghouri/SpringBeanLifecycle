package com.journaldev.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.journaldev.spring.service.EmployeeService;
import com.journaldev.spring.service.MyEmployeeService;

public class SpringMain {

	public static void main(String[] args) {
		//The context is returned only when all the spring 
		//beans are initialized properly with post-init method executions.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		System.out.println("Spring Context initialized");
		
		MyEmployeeService service = ctx.getBean("myEmployeeService", MyEmployeeService.class);
		//EmployeeService service = ctx.getBean("employeeService", EmployeeService.class);

		System.out.println("Bean retrieved from Spring Context");
		
		System.out.println("Employee Name="+service.getEmployee().getName());
		
		ctx.close(); //When context is getting closed, 
		//beans are destroyed in the reverse order 
		//in which they were initialized i.e in LIFO (Last-In-First-Out) order.
		System.out.println("Spring Context Closed");
	}

}
