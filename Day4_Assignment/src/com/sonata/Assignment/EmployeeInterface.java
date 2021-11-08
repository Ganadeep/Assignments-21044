package com.sonata.Assignment;

import java.util.List;

public interface EmployeeInterface
{
	public void addEmployee(Employee e); 

	public void deleteEmployee(Employee e); 

	public double yearSalary(Employee e1); 

	public double appSalary(Employee e1) ;
	public List<Employee>getEmployee();
}
