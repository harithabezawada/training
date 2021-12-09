package com.sonata;

public class AreaOfRectangle extends Shape {
	public double rectangle(double length, double width) {
		  return length * width;
		 }

		 public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  AreaOfRectangle ar = new AreaOfRectangle();
		  System.out.println("Area of Rectangle is : "+ar.rectangle(5.6, 2.9));

		 }
}
