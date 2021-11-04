package com.sonata.Assignment;

public class Tester extends Employee implements EmpInterface 
{
	public double SalCal(double TA, double HRA, double DA) {
		return this.EmpSal;
	}

	
		public void display() {
			
			System.out.println(EmpId+" "+EmpName+" "+EmpSal);
		}
	
	public static void main(String args[]) {
		Tester t1=new Tester();
		t1.EmpId=2000;
		t1.EmpName="Ganadeep";
		t1.EmpSal=160000.0;
		t1.display();
		System.out.println(t1.SalCal(5,15,300));
	} 
}
