package model;

public class Ans {
	public static String hidePhone(String fullPhoneNumber){   
		//1 Insert code here
		
	//`return new StringBuilder("xxx-xxx-")+fullPhoneNumber.substring(8);
	//=return "xxx-xxx-"+fullPhoneNumber.substring(8, 12);
	//String mask = "xxx-xxx-";
	//mask.append(fullPhoneNumber.substring(8));
	//return mask;
		return new StringBuilder(fullPhoneNumber).replace(0, 6, "xxx-xxx-").toString();
//		return new StringBuilder(fullPhoneNumber).replace(0, 7, "xxx-xxx-").toString();
		//return new StringBuilder("xxxx").insert(0, fullPhoneNumber, 0, 8).toString();
		//return new StringBuilder(fullPhoneNumber).substring(0, 8)+"xxxx";
		//return new StringBuilder(fullPhoneNumber).replace(8, 12, "xxxx").toString();
		//return new StringBuilder("xxxx").append(fullPhoneNumber, 0, 8).toString();
		//return new StringBuilder(fullPhoneNumber).append("xxxx", 8, 12).toString();
}
		
	 public static void main(String[] args) {
		System.out.println( hidePhone("8680954986"));
	        /*String myStr = "good";
	        char[] myCharArr = {'g', 'o', 'o', 'd' };
	        
	        String newStr = null;
	        for(char ch : myCharArr){
	            newStr = newStr + ch;
	        }

	        System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr)));
	        */
		/* Integer i = new Integer(42);
		 Long ln = new Long(42);
		 Double d = new Double(42.0);
		 System.out.println(i);
		 System.out.println(ln);
		 System.out.println(d);

while(i==ln){
	
}
		if( i == ln){
			System.out.println(1);
		}
		if( ln == d){
			System.out.println(2);
		}
		if( d.equals(ln)){
			System.out.println(3);
		}
		if(ln.equals(42) ){
			System.out.println(4);
		}
		if( i.equals(d)){
			System.out.println(5);
		}
		
		 
		
		  
*/    
//		   bool b = null;  

	// boolean b = 1;  

		  //boolean b = true|false;  

		  //bool b = (10<11);  

		  //boolean b = true||false;
		
//				 Boolean bool = false;
//			 Runnable r = new Thread();
//				 //(Assume that Thread is a class that implements Runnable interface)
//				 Thread t = new Runnable();
//				// (Assume that Runnable is a valid interface.)
//			 char ch = 10;
//			 Object o = new java.io.File("a.txt");
//				 
		// float f1 = 123_.345_667F;
		//long z = _123_456L;
		 //long y = 123_456_L;
		 //float f2 = 123_345_667F;
		 //Which of the following declarations are valid?
				//float f = 0x0123;
				//float f1 = 1.0;
				//. float f = 43e1;
				// float f = -1;
				// float f = 4;
		
			// int a = b = c = 100;
			// int a, b, c; a = b = c = 100;
			// int a, b, c=100;
			 //int a=100, b, c;
			 //int a= 100 = b = c;
		 
				// double d = 320;
				 //char c = 320;
				// float f = 22.0f/7.0f;
				// float f = 320;
				// None of the above is illegal.
				// byte b =  320;
				  



	    }

		 
}
