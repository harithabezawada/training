package com.sonata;

public class StudentDetails {
	int stid;
	String stname;
	
	 char stclass;
		
	 StudentDetails(int id,String name,char cls){
	  
	  this.stid=id;
	  
	  this.stname=name;
	  
	  this.stclass=cls;
	  
	 }
		
	 public void display() {
	  
	  System.out.println("Student id: "+stid);
	  
	  System.out.println("Student Name: "+stname);
	  
	  System.out.println("Student Class: "+stclass);
	  
	 }
		
	 public static void main(String[]args) {
	  StudentDetails s1=new StudentDetails(11,"Haritha",'1');
	  StudentDetails s2=new StudentDetails(22,"Indu",'2');
	  s1.display();
	  s2.display();
	  
	 }
		
	}

