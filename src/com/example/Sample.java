package com.example;

import java.util.ArrayList;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		
list.add(1);
list.add(5);
list.add(40);
list.add(2);
list.removeIf(e->e%2==0);   //predicate
System.out.println(list);

	}

}
