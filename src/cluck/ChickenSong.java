package cluck;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.courses.Courses;



public class ChickenSong {
	

		  public static void main(String[] args) { 
			  Chicken chick = new Chicken("xxx",34);
				Chicken chick1 = new Chicken("xyz",35);
			    List<Chicken> chic = new ArrayList<Chicken>();
			   
				chic.addAll(Arrays.asList(new Chicken[] {chick,chick1}));
				
			HenHouse house = ()->{
			//	return null;
				return chic;
				
			};
				Chicken chicken = house.getChickens().get(0); 
	     for(int i=0; i<house.getChickens().size();  
			chicken = house.getChickens().get(i++)) {  
				System.out.println("Cluck");  } } 
}
