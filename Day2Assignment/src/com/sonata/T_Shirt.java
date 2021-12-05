package com.sonata;

public class T_Shirt {
	 String color;
	 String material;
	 String design;
	 String Size;
		
	 public T_Shirt(String col,String mat,String des,String siz) {
	  
		
	 this.color=col;
	 this.material=mat;
	 this.design=des;
	 this.Size=siz;
		
	 }
		
	 public void smallS() {
	  
	  System.out.println("This is SmallS size");
	  
	 }
		
	 public void MediumM() {
	  System.out.println("This is mediumM size");
	  
	 }
	 public void LargeXL() {
	  System.out.println("This is LargeXL size");
	 }
		
	 public void display() {
	  System.out.println("Color: "+color); System.out.println();
	  System.out.println("Material: "+material);System.out.println();
	  System.out.println("Design: "+design); System.out.println();
	  System.out.println("Size: "+Size);System.out.println();
	  
	 }
		
	 public static void main(String[]args) {
	  T_Shirt s1=new T_Shirt("pink","polyester","halfhand","S");
	  System.out.println();
	  s1.display();
	  s1.smallS();
	  T_Shirt s2=new T_Shirt("Yellow","polyester","sleave","M");
	  System.out.println();
	  s2.display();
	  s2.MediumM();
	  T_Shirt s3=new T_Shirt("blue","polyester","Fullhand","XL");
	  System.out.println();
	  s3.display();
	  s3.LargeXL();
	 }
	}

