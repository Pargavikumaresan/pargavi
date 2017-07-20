package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DirStream {
	///15.
	/*private String s;
	private boolean b;
	*/
	/*default void print(){
		
	}
*/
//6.	/*public static void main(String[] args) throws SQLException {*/
	
	
	public static void main(String[] args)  {
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
		
		//int array[] = new int[-2];  negative
		
//11.
		/*int sum = 0;
		for(int x = 0;x<=10; x++)
			
		sum+=x;
		System.out.println("Sum for 0 to "+x);
		
	*/
		
//12.
	/*	Double num = 0.0;
		
		try{
		num	 = Double.valueOf("120D");
		System.out.println(num);
			
		} catch(NumberFormatException e){
			System.out.println(e);
			
		}
System.out.println(num);*/
		
//13.
	/*String s ="A";
	switch(s){
	case "a":System.out.println("sample");
	default:System.out.println("default");
	case "A":System.out.println("Capital");
	}
*/
	
//14.
		
		/*int x=10;
		System.out.println(x>10?">":x<10?"<":"=");
		*/
		
		
//15.
		/*DirStream s1 = new DirStream();
		System.out.println(s1.s);
		System.out.println(s1.b);
		*/
	
		
//16.
		/*float x=1;
		float y=3;
		// int ,long not applicable
		//double z = x+y;
		float z = x+y;
*/

//17.
	/*	Integer num = Integer.valueOf("808.9");
		System.out.println(num);
	*/
	
//18.
	/*	System.out.println(new LocalTime().now());
			System.out.println(LocalTime.now());
			LocalDate d = LocalDate.of(2015, 7, 6);
			Period p = Period.ofDays(1);
					System.out.println(d.plus(p));
		*/	// TODO Auto-generated method stub
		
//19.
		/*StringBuilder sb = new StringBuilder("1ZO");   stringbuiler doesnot have cancat method
		sb.append("-808");
		System.out.println(sb);
		*/
		
//20.
		/*public DirStream(){
		
	}*/
		
		
	}
}

