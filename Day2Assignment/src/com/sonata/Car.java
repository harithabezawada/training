package com.sonata;


	public class Car{
	 int speed;
	 double regularPrice;
	 String color;
	 Car(int speed ,double regularPrice,String color)
	 {
	  this.speed = speed;
	  this.regularPrice=regularPrice;
	  this.color=color;
	 }
	 public double getSalePrice()
	 {
	  return regularPrice;
	 }
	 public void display()
	 {
	  System.out.println(speed);
	  System.out.println(regularPrice);
	  System.out.println(color);
	 }
	
}
