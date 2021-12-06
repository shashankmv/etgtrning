package com.sonata.fourth;

public class address {
	private int doorno;
	private String street;
	private String city;
	private int pincode;
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "address [doorno=" + doorno + ", street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
}
