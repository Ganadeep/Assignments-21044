package com.sonata.Assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Teststudent {
	public static void main(String[] args) 
	{
		 
		
		List<Student> studentlist=new ArrayList<Student>();
	     studentlist.add(new Student("Varma",107,100));
	     studentlist.add(new Student("Ayyappa",109,110));
	     studentlist.add(new Student("Satheesh",106,99));
	     studentlist.add(new Student("Kalyan",105,98));
	     studentlist.add(new Student("Ganadeep",108,101));
	     System.out.println("Before sorting : ");
	     //forEach for printing the list
	     studentlist.forEach((s)->System.out.println(s));
	     System.out.println("After sorting : ");
	     
	     studentlist.sort((Student s1,Student s2)->s1.getStdid()-s1.getStdid());
	    // studentlist.sort((Student s1,Student s2)->s2.getStdmarks()-s1.getStdmarks());
	     studentlist.forEach((s)->System.out.println(s));
	    
	}
}
