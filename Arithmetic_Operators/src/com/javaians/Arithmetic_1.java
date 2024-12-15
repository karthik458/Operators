package com.javaians;

import java.util.Scanner;

public class Arithmetic_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int x = 1;
      int y = 2;
      int z = x+y;
      System.out.println("Hardcore sum of x and y is=" +z);
      // taking input from user
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter the value of a");
      int a = sc.nextInt();
      System.out.println("Please enter the value of b");
      int b = sc.nextInt();
      int c = a+b;
      System.out.println("Sum of a & b is: "+c);
	}
}
