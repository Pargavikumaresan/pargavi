package com.model;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer Digit[] = {1, 2, 3, 4, 5};
		int number = Digit.length;
		System.out.println(number);
		int sum = 0;
		for(int i = 0;i < number;i++){
			if((Digit[i]%2) != 0){
				sum = sum + Digit[i];
			}
		}
		System.out.println(sum);
				
		}
	
	

}
