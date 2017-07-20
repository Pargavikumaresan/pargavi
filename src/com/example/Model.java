package com.example;

public class Model {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String start = "AniMaL   "; 
		String trimmed = start.trim();                 // "AniMaL"
		
		String lowercase = trimmed.toLowerCase();      // "animal" 
		String result = lowercase.replace('a', 'A');   // "Animal"
		System.out.println(result);
		StringBuilder sb = new StringBuilder("animals");  
			sb.insert(7, "-");      //sb = animals5:             // 
			 sb.insert(0, "-");       // sb = -animals6:     
			sb.insert(4, "-");                   // sb = -ani-mals 7: 
			System. out .println(sb);
			
			String name ="Raja";
			StringBuilder sb1 = new StringBuilder(name);
			sb1.reverse();
			System.out.println(sb1);
			String s = sb1.toString();
			System.out.println(s);
			 String name1 = "rani";
			 int a = 4;
			 int b = 3;
			 System.out.println(a+b+name1);



	}

}
