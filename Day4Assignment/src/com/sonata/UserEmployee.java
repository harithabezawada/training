package com.sonata;
import java.util.ArrayList;
public class UserEmployee {
	public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  EmployeeImpl emp=new EmployeeImpl();
		  
		  //Adding new employee
		  Employee e=new Employee();
		  e.setEmpID(111);
		  e.setEmpName("Haritha");
		  e.setEmpSalary(50000);
		  emp.addEmployee(e);
		  
		  //Adding new employee
		  Employee e1=new Employee();
		  e1.setEmpID(222);
		  e1.setEmpName("Indu");
		  e1.setEmpSalary(5000);
		  emp.addEmployee(e1);
		  
		  
		  emp.displayEmployees();
		  
		  //Removing employee
		  emp.deleteEmployee(e);
		  
		  System.out.println("345 employee is removed");
		  emp.displayEmployees();
		  
		  //Employee year salary
		  System.out.println(e1.getEmpName()+" year salary is: "+emp.yearSalary(e1));
		 }
}
