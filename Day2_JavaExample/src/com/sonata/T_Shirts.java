package com.sonata;

public class T_Shirts 
{
   String color; String material;String design;
   T_Shirts(){}
   T_Shirts(String c,String m,String d)
         {
	      color=c;
	      material=m;
	      design=d;
	      }
   public String size(String size)
   {
	return size; 
   }
   public void display() 
   {
 	 System.out.println(color+" "+material+" "+design);
   }
   
   public static void main (String args[]) 
   {
  	 T_Shirts t1=new T_Shirts("Blue","Cotton","printed");
  	 t1.display();
  	 System.out.println(t1.size("Avaliable size is: small"));
  	
  	 T_Shirts t2=new T_Shirts("GREEN","fabaric","normal");
 	 t2.display();
 	 System.out.println(t2.size("Avaliable size is: Large"));
 	 
 	 T_Shirts t3=new T_Shirts("White","woolen","Black dots");
 	 t3.display();
 	 System.out.println(t3.size("Avaliable size is: Medium"));
 	 
 	 T_Shirts t4=new T_Shirts("GRAY","Cotton","checks");
 	 t4.display();
 	 System.out.println(t4.size("Avaliable size is: XXXL"));
  	
   }
   
}
