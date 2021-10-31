package com.sonata;

public class Student2_assign
{
      int stdId;String stdName;int Stdclass;
      Student2_assign(){}                           //default cons
      Student2_assign(int a,String b,int n)
      {
    	  this.stdId=a;
    	  this.stdName=b;
    	  this.Stdclass=n;
      }
      
      public void display() 
      {
    	 System.out.println(stdId+" "+stdName+" "+Stdclass);
      }
      public static void main (String args[]) 
      {
     	 Student2_assign s1 = new Student2_assign(456,"vinay",6);
     	 s1.display();
     	 Student2_assign s2 = new Student2_assign();
     	 s2.stdId=5979;
     	 s2.stdName="sowji";
     	 s2.Stdclass=1;
     	 s2.display();
      }
}
