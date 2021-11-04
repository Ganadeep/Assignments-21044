package com.sonata.Assignment;

public class Developer extends Employee implements EmpInterface
{
	
	public double SalCal(double TA, double HRA, double DA) {
		return this.EmpSal+TA+HRA+DA;
	}

	
		public void display() {
			
			System.out.println(EmpId+" "+EmpName+" "+EmpSal);
		}
	
	public static void main(String args[]) {
		Developer d1=new Developer();
		d1.EmpId=1999;
		d1.EmpName="Gana";
		d1.EmpSal=90000.0;
		d1.display();
		System.out.println(d1.SalCal(50,150,300));
	} 
}
