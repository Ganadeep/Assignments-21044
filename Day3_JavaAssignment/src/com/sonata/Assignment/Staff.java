package com.sonata.Assignment;

public class Staff extends Employee1{
     String title;
	@Override
	double calculateSalary() {
		double salary;
		double HRA =0.18*basicPay;
		return salary=basicPay +HRA;
	}

	@Override
	public String toString() {
		return "Staff [empid=" + empid + ", empName=" + empName + "]";
	}
	public static void main(String args[]) {
		Staff s=new Staff();
		s.basicPay=10000;
		s.empid=102;
		s.empName="Varma";
		System.out.println(s.toString());
	     System.out.println("The salary for Staff is "+s.calculateSalary());
	}

}
