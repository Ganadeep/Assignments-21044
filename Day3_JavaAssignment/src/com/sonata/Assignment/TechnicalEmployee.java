package com.sonata.Assignment;

public class  TechnicalEmployee extends Employee1{

	@Override
	double calculateSalary() {
		double salary;
		double HRA =0.12*basicPay;
		return salary =basicPay +HRA;
	}
  String techskill;
@Override
public String toString() {
	return "TechnicalEmployee [empid=" + empid + ", empName=" + empName + "]";
}
   public static void main(String args[]) {
	   TechnicalEmployee T= new TechnicalEmployee();
	     T.basicPay=50000;
	     T.empid=108;
	     T.empName="Satheesh";
	     System.out.println(T.toString());
	     System.out.println("The salary for technical employee is "+T.calculateSalary());
   }
}
