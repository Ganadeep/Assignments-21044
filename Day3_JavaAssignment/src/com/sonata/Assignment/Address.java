package com.sonata.Assignment;

public class Address {
   int doorNo;
   String street;
   String city;
   int pincode;
public int getDoorNo() {
	return doorNo;
}
public void setDoorNo(int doorNo) {
	this.doorNo = doorNo;
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
	return "Address [doorNo=" + doorNo + ", street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
}
}
