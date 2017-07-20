package cer2;

public class SomeClass {
	public static void main( String args[ ] ){      

		if (args.length == 0 ){          

		System.out.println("no arguments") ;      

		}      

		else{        

		 System.out.println( args.length + " arguments") ;      

		}  

		 }

/*	public static void main(String args[ ] ){      

		StringBuilder sb = new StringBuilder("12345678");      

		sb.setLength(5);      

		sb.setLength(10);      

		System.out.println(sb.length());  

		 }

*/


	/* public int transformNumber(int n){   
		 int radix = 2;    int output = 0;   
		 output += radix*n;  
		 radix = output/radix;   
		 if(output<14){     
			 return output; 
			 }    else{  
				 output = output*radix/2;    
				 return output;  
			//	 }    else {     
					 return output/2;    
					 } 
				 }
*/

}
