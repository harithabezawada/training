package com.sonata;

public class Employee {
int	 EmpID;
String EmpName;
double EmpSalary;
public int getEmpID() {
	return EmpID;
}
public void setEmpID(int empID) {
	EmpID = empID;
}
public String getEmpName() {
	return EmpName;
}
public void setEmpName(String empName) {
	EmpName = empName;
}
public double getEmpSalary() {
	return EmpSalary;
}
public void setEmpSalary(double empSalary) {
	EmpSalary = empSalary;
}
@Override
public String toString() {
	return "Employee [EmpID=" + EmpID + ", EmpName=" + EmpName + ", EmpSalary=" + EmpSalary + "]";
}

	
}
