package model;

import java.util.Scanner;

public class Model {
	    
		static Model ref;
		String[] arguments;    
		public static void main(String args[]){   
			ref = new Model(); 
			ref.func(args);  
			}
		public void func(String[] args){
			ref.arguments = args;   
			}
	

/*public static void main(String[] args) {
	 String Alphabet[] = {"Z","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","A"};
     Scanner s = new Scanner(System.in);
     int number = s.nextInt();
     int n1 = s.nextInt();
     int n2 = s.nextInt();
     
     if(n1<26){
         System.out.println(Alphabet[n1-1]);
         System.out.println(Alphabet[n2-1]);
        
     }
     else{
         System.out.println( "invalid number");
     }
    
    
}
*/}
