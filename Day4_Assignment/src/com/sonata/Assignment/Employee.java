package com.sonata.Assignment;

public class Employee 
{
   int Empid;
   String empname;
   double empsal;
public int getEmpid() {
	return Empid;
}
public void setEmpid(int empid) {
	Empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public double getEmpsal() {
	return empsal;
}
public void setEmpsal(double empsal) {
	this.empsal = empsal;
}
@Override
public String toString() {
	return "Employee [Empid=" + Empid + ", empname=" + empname + ", empsal=" + empsal + "]";
}
}
