package com.roytus.soap.service;

import javax.jws.WebService;

@WebService(name = "HelloServiceImpl", targetNamespace = "http://service.soap.roytus.com/", serviceName = "HelloServiceImplService", portName = "HelloServiceImplPort")
public class HelloServiceImpl {

	public String sayHello() {
		return "Hello roytus";
	}

}
