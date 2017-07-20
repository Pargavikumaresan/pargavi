package square;

public class Square {
 /*   private double side = 0;  // LINE 2
	//private int side = 0;
    
    public static void main(String[] args) {  
    	// LINE 4
       // Square sq = new Square();  // LINE 5
    	Square sq = new Square();
    	// side = 10;  // LINE 6

    	sq. side = 10;  // LINE 6
    	
   }
*/
	//Int x =10;
	//global int x=10;
    private double side = 0;
    String color;
    public Square(double length){
        this.side = length;
    }
    public double getSide() {  return side;    }

    public void setSide(double side) {  this.side = side;   }
    


}
