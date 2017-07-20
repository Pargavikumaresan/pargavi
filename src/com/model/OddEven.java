package com.model;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number to be check");
		num = s.nextFloat();
		System.out.println(num);
		int num1 =(int)( num /2);
		if((num1*2) == num) {
			System.out.println("Even");
			
		} else {
			System.out.println("Odd");
		}

	}

}

