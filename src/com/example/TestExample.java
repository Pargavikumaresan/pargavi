package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Runnable run = ()->{
			System.out.println("run");
		};*/
		/*Runnable run =()->System.out.println("run");*/
	
		
		
		/*List<Integer> list = new ArrayList<>(); 
		list.add(21);
		list.add(30);
		list.removeIf(e->e%2 !=0);
		System.out.println(list);
*/
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("coke");
		arr.add("pepsi");
		arr.add("miranda");
		System.out.println("The arrat is = "+ arr);
		String[] s1 = new String[arr.size()];
		String[] s2 = arr.toArray(s1); 
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("s2 = "+Arrays.toString(s2));
		System.out.println("s1 == s2: "+(s1==s2));
		System.out.println("s1 = "+Arrays.toString(s1));
		System.out.println("s2 = "+Arrays.toString(s2));
		s1 = new String[1];
		s1[0] = "Test Data";
		System.out.println("s1 ="+Arrays.toString(s1));
		s2 = arr.toArray(s1);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("s1 == s2: "+(s1==s2));
		System.out.println("s1 = "+Arrays.toString(s2));
		System.out.println("s2 = "+Arrays.toString(s2));
		
		
	}

}
