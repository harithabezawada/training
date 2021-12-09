package com.sonata;

public  abstract class AbstractEmp {
	int EmpID;
	 String EmpName;
	 Address Address;
	 double BasicPay;
	 int Noofleaveavailable;

	 AbstractEmp(int a , String b){
	  this.EmpID = a;
	  this.EmpName = b ;
	 }

	 AbstractEmp(int a, String b, Address c, double d, int e){
	  this.EmpID = a;
	  this.EmpName = b ;
	  this.Address = c;
	  this.BasicPay = d;
	  this.Noofleaveavailable = e;
	 }

	 public abstract double calculateSal();

	 public void display() {
	  System.out.println("Employee Id : "+EmpID);
	  System.out.println("Employee Name : "+EmpName);
	  System.out.println("Employee Address : "+Address);
	  System.out.println("Employee Basic Pay : "+BasicPay);
	  System.out.println("Employee No of leaves Available : "+Noofleaveavailable);
	 }
}
