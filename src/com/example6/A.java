package com.example6;

public class A{
		   int i;
		   public A(int x) {
			   this.i = x;
			   }
		}
		class B extends A{
		   int j;
		   public B(int x, int y) { 
			   super(x);
			   this.j = y;
			   }
		  

		B(int z ) { this(z, z); }
	//	B( ) { }
		//B(int y ) { j = y; }
		//B(int y ) { i = y; j = y*2; }
		//B(int y ) { super(y*2 ); j = y; 	}

		
		}




