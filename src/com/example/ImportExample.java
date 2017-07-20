package com.example;


	import java.lang.System; 
	import java.lang.*;
	import java.util.Random; 
	import java.util.*; 
	public class ImportExample { 
		public static void main(String[] args) { 
			Random r = new Random(); 
			System.out.println(r.nextInt(10)); 
			StringBuilder one = new StringBuilder();
			StringBuilder two = new StringBuilder();
			StringBuilder three = one.append("a");
			System.out.println(one);
			System.out.println(three);
			System.out.println(one == two); // false
			System.out.println(one == three); // true
			String x = "Hello World";
			String y = " Hello World".trim(); 
			System.out.println(x +" ");
			System.out.println(x == y);  
			System.out.println(x.equals(y));

			} 
		
			}



