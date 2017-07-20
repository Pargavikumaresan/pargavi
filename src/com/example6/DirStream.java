package com.example6;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DirStream {

	/*public static void main(String[] args) throws SQLException {*/
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	//  1. 
		
		//Path one = Path.get("/capybara/food","apples.txt");
		//Path two = Path.get("/capybara/food","apples.txt");
        //Files.copy(one, two);
		
//2.		
		/*List letters = Arrays.asList('a','b','c');
		//letters.stream();
		letters.distict();
		letters.sorted();
		letters.forEach(System.out::println);*/
		
//3.
		
	/*Path userDirectory = Paths.get("/coralreef/..clown/fish").normalize();
	Path pantherDirectory = userDirectory.getRoot().getParent().resolve("dolphin");
	System.out.println(pantherDirectory.toAbsolutePath());
	*/	
		
// 4. PrintHolidays		

//5.
		
		/*Stream primates = Stream.of("gorilla","lemur","monkey","orangutan");
		Stream turtles = Stream.of("leatherback","green","orangutan");
		ConcurrentMap> data = Stream.of(primates,turtles)
				.flatMap(s->s).parallel()
				.collect(Collectors.groupingByConcurrent(s->s.endsWith("n")));
		System.out.println(data.get(false).size()+""+data.get(true).size());
*/	
//	6.
		/*Connection con = DriverManager.getConnection("jdbc:derby:zoo");
		Statement stmt = con.createStatement();
		int result = stmt.executeUpdate("select * from food");
		System.out.println(result);
*/	
	
// 7.
	
	/*	Path path = Paths.get("/F/hello.txt");
		try(BufferedReader reader = Files.newBufferedReader(path)){
			String s = null;
			while(reader.readLine()!=null)
				System.out.println(s);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/
		
//8.
		
		/*Stream prime = Stream.of(2,3,5,7);
		Stream composite = Stream.of(4,6,8);
		ConcurrentMap> data = Stream.combine(prime,composite)
				.flatMap(s->s).parallel()
				.collect(Collectors.groupingByConcurrent(n->(n%2)==0));
		System.out.println(data.get(false).size()+""+data.get(true).size());
*/
	
		
//9.
		
		/*int[] nums = new int[] {1,4,6};
		Object p = nums;
		System.out.println(nums.length);
		int[] two = (int[])p;
		System.out.println(nums.equals(p));
		System.out.println(two.equals(nums));
		System.out.println(p);
		System.out.println(two.length);
		System.out.println(two[two.length]);
	}*/
	
	
//10.
		
		
		
		
	

}
}