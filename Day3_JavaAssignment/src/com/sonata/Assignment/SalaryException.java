package com.sonata.Assignment;


/*class MyOwnException  extends Exception
{
	   MyOwnException (String s)
	 {
		 super(s);
	 }

}

public class SalaryException extends Employee
{
	 public double SalCal(double TA, double HRA, double DA) throws MyOwnException  { 
			
		   if(((this.EmpSal+TA+HRA+DA)*12) <100000)
			   throw new MyOwnException("Annual Salary is less than One Lakh");
		   else
			   System.out.println("Annual Salary is greater than One Lakh");
		   return (this.EmpSal+TA+HRA+DA)*12 ;
			   }

		 
		
			   public static void main(String args[]) throws MyOwnException {
				   SalaryException s1= new  SalaryException();
				   System.out.println(s1.SalCal(1000, 1000, 1000));
				  
			   }
}
*/


public class SalaryException extends Exception{
	double empSal;
	SalaryException(String s)
	{
		super(s);
	}
	SalaryException()
	{
	}
	public void show() throws SalaryException
	{
		if(empSal<100000)
		{
			throw new SalaryException ("employee salary is less than 100000");
		}
		else
		{
			System.out.println("employee salary is above 100000");
		}
	}
	
	public static void main(String args[]) throws SalaryException
	{
		SalaryException Se=new SalaryException();
		Se.empSal=1909944;
		Se.show();
		
	}
}
