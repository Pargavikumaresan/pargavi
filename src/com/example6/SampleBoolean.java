package com.example6;

public class SampleBoolean {

	static boolean a;
	static boolean b;
	static boolean c;
    static boolean check=(a=true)||(b=true) && (c=true);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
if(check){
	System.out.println("a = "+ a +" b = "+b+" c = "+c);
}


	}

}
