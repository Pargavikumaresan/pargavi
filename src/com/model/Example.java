package com.model;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String name = "java";
		String city = "java";
		System.out.println(name.hashCode());
		System.out.println(city.hashCode());
		if(name==city){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}

	}

}
