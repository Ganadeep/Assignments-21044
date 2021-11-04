package com.sonata.Assignment;

public class Manager extends Employee implements EmpInterface{
	
	public double SalCal(double TA,double DA,double HRA) 
          {
		return this.EmpSal;
		  }
	   public void display() {
				
				System.out.println(EmpId+" "+EmpName+" "+EmpSal);
			   }
	
       public static void main(String args[])
       {
    	   Manager m1=new Manager();
    	   m1.EmpName="kalyan";
    	   m1.EmpId=567;
    	   m1.EmpSal=80000.0;
    	   m1.display();
    	  
    		 System.out.println(m1.SalCal(100,200,30));
       }


	

}
