package com.sonata.Assignment;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public  class EmployeeImp1 extends Employee implements EmployeeInterface{
   List<Employee> L1=new LinkedList<>();

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
	L1.add(e);	
	}
	@Override
	public void deleteEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double yearSalary(Employee e1) {
		// TODO Auto-generated method stub
		return empsal*12;
	}
	@Override
	public double appSalary(Employee e1) {
		// TODO Auto-generated method stub
		if(empsal<10000)
		return empsal+5000;
		else
		return empsal;
	}
	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		Iterator itr=L1.iterator();
		while(itr.hasNext()) {
			itr.next();
		}
		return L1;
	}

}
