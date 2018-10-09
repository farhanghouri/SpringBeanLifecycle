package com.journaldev.spring.service;

import com.journaldev.spring.bean.Employee;
// 2nd approach

//Providing init-method and destroy-method attribute values for the bean in the spring bean configuration file. 
//This is the recommended approach because of no direct dependency 
//to spring framework and we can create our own methods.
public class MyEmployeeService{

	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public MyEmployeeService(){
		System.out.println("MyEmployeeService no-args constructor called");
	}
	//pre-destroy method
	public void destroy() throws Exception {
		System.out.println("MyEmployeeService Closing resources");
	}
	//post-init method
	public void init() throws Exception {
		System.out.println("MyEmployeeService initializing to dummy value");
		if(employee.getName() == null){
			employee.setName("Pankaj");
		}
	}
}
