package com.hxw.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Weather", propOrder = { "city", "celsius", "fahrenheit" })
@XmlRootElement(name = "Weather")
public class Weather {
	@XmlElement(name = "Ciy", required = false)
	private String city;

	@XmlElement(name = "Celsius", required = true)
	private double celsius;
	@XmlElement(name = "Fahrenheit", required = true)
	private double fahrenheit;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	public double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

}
