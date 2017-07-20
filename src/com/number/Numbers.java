package com.number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numbers {
	Scanner s = new Scanner(System.in);
	
	int n = s.nextInt();
	
	List<Integer> number = new ArrayList<Integer>();
	int i = 6;
	void method(){
	if(i<n)
		number.add(i++);
	}
	
public static void main(String[] args) {
	
	System.out.println("Enter the number Integer value to be print");
	Numbers num = new Numbers();
	num.method();
	System.out.print(" ");
	 
		System.out.println(num.number);	
}


}
