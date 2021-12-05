package com.sonata;

public class Product {
	int pid;
	 String pname;
	  double pprice;
		
	 Product(int id,String name,double price){
	  this.pid=id;
	  this.pname=name;
	  this.pprice=price;
	  
	  
	 }
	 public double Totalbill(double GST) {
	  double total=this.pprice*GST;
	  return total;
	 }
		
	 public void display() {
	  System.out.println("Productid: "+pid);System.out.println();
	  System.out.println("Product name: "+pname); System.out.println();
	  System.out.println("Base Price: "+pprice);System.out.println();
	 }
		
	 public static void main(String[]args) {
	  Product p1=new Product(01,"MOBILE",2000);
	  p1.display();
	  double a=p1.Totalbill(0.04);
	  System.out.println("TAX :"+a);
	  System.out.println();
	 
	  
	 }

	}