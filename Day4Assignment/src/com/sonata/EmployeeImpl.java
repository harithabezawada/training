package com.sonata;
import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeImpl implements EmployeeInt {
	
 private static final Exception DuplicateEmployeeID = null;
 ArrayList<Employee> list=new ArrayList<Employee>();
	
 @Override
 public void addEmployee(Employee e) {
  // TODO Auto-generated method stub
  if (e.getEmpSalary()<120000){
   e.setEmpSalary(e.getEmpSalary()+10000);
  }
  try {
  for (Employee employee : list) {
   if(employee.getEmpID()==e.getEmpID()){
    throw DuplicateEmployeeID; 
   }
  }
  list.add(e);
  }catch (Exception e1) {
   // TODO Auto-generated catch block
   System.err.print("Entered employee id("+e.getEmpID()+") already exists\n");
  }
  
 }

 @Override
 public void deleteEmployee(Employee e) {
  // TODO Auto-generated method stub
  list.remove(e);
 }

 @Override
 public double yearSalary(Employee e) {
  // TODO Auto-generated method stub
  return e.getEmpSalary()*12;
 }

 @Override
 public double appSalary(Employee e) {
  // TODO Auto-generated method stub
  return 0;
 }
	
 public void displayEmployees(){
  System.out.println("ID\tName\t\tSalary");
  for (Employee employee : list) {
   System.out.println(employee);
  }
 }
	
}