package example4;

public class Holder {
	public static void main(String[] args) {
		 
		    boolean keepGoing = true;
		        int count = 0;
		        int x = 3; 
		        while(count++ < 3) {
		    	       int y = (1 + 2 * count) % 3;
		     switch(y) { 
		     default:
          	  // break;
		    	
		          case 0:
		    		   x -= 1; 
		    		       break;
	               case 1: 
	                   x += 5; 
	                  // break;
	                //System.out.println("error");
	 		        
	          }     }   
		        System.out.println(x); 
		  
		/*//String s1 = new String("Java");
		//String s2 = new String("Java");
		//System.out.println(s1.hashCode());
		//System.out.println(s2.hashCode());
		String s1 = ("Java");
		String s2 = ("Java");

		
		StringBuilder sb = new StringBuilder();
		sb.append("Ja").append("va");
		//System.out.println(sb);
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		System.out.println(sb.toString()==s1);
		System.out.println(sb);
		System.out.println(sb.toString().equals(s1));
*/
	}
	//int x;
	 //static  int x;
	//protected int x;
	// private int x;
	 //public int x;

	 /*  public static void main(String[] args){
		   Holder f = new Holder();
		   int i;
		  this.x =i;
		
	      // lot of code.

	}
*/
	  

	   /*int value = 1;
	  
	   Holder link;
	   public Holder(int val){ this.value = val; }
	   public static void main(String[] args){
	    final Holder a = new Holder(5);
	    
	    Holder b = new Holder(10);
	    a.link = b;
	    b.link = setIt(a, b);
	    System.out.println(a.link.value+" "+b.link.value);
	   }
	   
	   public static Holder setIt(final Holder x, final Holder y){
	       x.link = y.link;
	       return x;
	   }
	  */ 

	/*public  double methodX( byte by){
	    double d = 10.0;
	    return (long) by/d*3;
	}


	public static void doStuff() throws Exception{    

		System.out.println("Doing stuff...");        

		if(Math.random()>0.4){            

		throw new Exception("Too high!");         }  

		 System.out.println("Done stuff.");  

		  }        

		 public static void main(String[] args) throws Exception {        

		 doStuff();      

		 System.out.println("Over");        

		} 
*/	  /*static int someInt = 10;
	  public static void changeIt(int a){
	    a = 20;
	  }
	  public static void main(String[] args){
	    changeIt(someInt);
	    System.out.println(someInt);
	  }*/

    /*private int myValue = 0;
    
    public void showOne(int myValue){
        myValue = myValue;
    }
    
    public void showTwo(int myValue){
        this.myValue = myValue;
    }    
    public static void main(String[] args) {
        ChangeTest ct = new ChangeTest();
        ct.showTwo(200);
        System.out.println(ct.myValue);
        ct.showOne(100);
        System.out.println(ct.myValue);
    }
*/
	/* private int myValue = 0;
	    
	    public void showOne(int myValue){
	        myValue = myValue;
	    }
	    
	    public void showTwo(int myValue){
	        this.myValue = myValue;
	    }    
	    public static void main(String[] args) {
	        ChangeTest ct = new ChangeTest();
	        ct.showOne(100);
	        System.out.println(ct.myValue);
	        ct.showTwo(200);
	        System.out.println(ct.myValue);
	    }
	*/
/*			int i1;    static int i2;    

			public void method1(){      

			int i;   
			this.i1 = i2;
			//this.i = 4;
			i = this.i2;
			//this = new Test( );
			i = this.i1;


			// ... insert statements here    

			}

			// FIRST
	public static void main(String[] args) {
		String t ;
		String k;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the t");
		t = s.next();
		System.out.println("Enter the k");
		k = s.next();
	   
		      

			String String = "string isa string";      

			System.out.println(String.substring(3, 6));  
			System.out.println( "    hello java guru   ".trim());



			}


	public doStuff() throws FileNotFoundException, IllegalArgumentException{
	    //valid code not shown
	}

	public null doStuff() throws FileNotFoundException, IllegalArgumentException{
	    //valid code not shown
	}
	public void doStuff() throws FileNotFoundException, IllegalArgumentException{
	    //valid code not shown
	}
	
	


	private doStuff() {
	    //valid code not shown
	}
		

	public static void main(String[] args) {
	boolean check =	"Hello world".toLowerCase( ).equals("hello world");
	boolean check1 = "hello world".compareTo("Hello world") < 0 ;
    boolean check2= "HELLO world".equalsIgnoreCase("hello world");
    boolean check3 =	"hello world".equals("hello world");
    boolean check4 =	"hello".concat(" world").trim().equals("hello world");


}


	
		*/


}
