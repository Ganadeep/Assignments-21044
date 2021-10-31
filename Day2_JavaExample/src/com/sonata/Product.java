package com.sonata;

public class Product 
{
    int ProId;String ProName;double ProPrice;
    
    Product(){}
    Product(int I,String N,double P)
       {
    	this.ProId=I;
    	this.ProName=N;
    	this.ProPrice=P;
       }
    public void display() 
    {
  	 System.out.println(ProId+" "+ProName+" "+ProPrice);
    }
      public double additional_GST(double GST) 
      {
    	return this.ProPrice+GST;
      }
    public static void main(String args[]) 
    {
    	Product P1=new Product(5979,"Phone",7000);
    	P1.display();
    	System.out.println("Additional TAX and including ProPrice is:"+" "+P1.additional_GST(100));
    }
}
