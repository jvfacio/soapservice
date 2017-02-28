package com.hxw.entity;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Person", propOrder = { "lastName", "fisrtName" })
@XmlRootElement(name = "Person", namespace = "http://service.soap.hxw.com/")
public class Person {
	// @XmlElement(name = "fisrtName", namespace = "")
	// @XmlElement(name = "arg0")
	private String fisrtName;
	// @XmlElement(name = "lastName", required = false)
	private String lastName;

	public String getFisrtName() {
		return fisrtName;
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
