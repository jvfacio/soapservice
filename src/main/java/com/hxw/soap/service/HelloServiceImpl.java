package com.hxw.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.hxw.entity.Person;

@WebService(name = "HelloServiceImpl", targetNamespace = "http://service.soap.hxw.com/", serviceName = "HelloServiceImplService", portName = "HelloServiceImplPort")
public class HelloServiceImpl {

	@WebMethod(operationName = "sayHello", action = "")
	public String sayHello(Person person) {
		return "Hello HXW " + person.getFisrtName() + " " + person.getLastName();
	}

	@WebMethod(operationName = "createNewPerson", action = "")
	public Person createNewPerson(Person person) {
		Person p = new Person();
		p.setFisrtName("new_" + person.getFisrtName());
		p.setLastName("NEW_" + person.getLastName());
		return p;
	}

}
