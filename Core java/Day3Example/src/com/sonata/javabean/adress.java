package com.sonata.javabean;

public class adress {
private String city;
private String state;
private int pin;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
@Override
public String toString() {
	return "adress [city=" + city + ", state=" + state + ", pin=" + pin + "]";
}


}
