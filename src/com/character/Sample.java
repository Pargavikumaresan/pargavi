package com.character;

public class Sample {
	public static void main(String[] args) {    
		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {  
			for (char x = 'a'; x <= 'c'; x++) {    
		if (a == 2 || x == 'b'){
			//System.out.print(" " + a + x);
			continue FIRST_CHAR_LOOP;  
	
		
	}  
		System.out.print(" " + a + x);
		}
	
	}  
	
	}
	
	
	

}
