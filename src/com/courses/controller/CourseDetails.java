package com.courses.controller;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;


import com.courses.Courses;

public class CourseDetails {
	public static void main(String[] args) {
		
		Courses c = new Courses(1,"java",LocalTime.of(6,5),"Yes","Collections");
		Courses c1 = new Courses(2,"MySql",LocalTime.of(3,5),"Yes","Joins");
		Courses c2 = new Courses(3,"HTML",LocalTime.of(6,8),"No","table tags");
		Courses c3 = new Courses(4,"Servlet",LocalTime.of(4,5),"No","Life cycle of servlet");
		
		List<Courses> course = new ArrayList<Courses>();
		course.addAll(Arrays.asList(new Courses[] {c,c1,c2,c3}));
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("1.List all courses , 2. List all active courses , 3. List all inactive courses , 4. Edit a course and its contents , 5. Delete a course and its contents , 6. Add a course and its contents , 7. Exit  ");
		System.out.println("Enter your Choice");
		int choice = s.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("List of all courses");
			System.out.println(course);
			break;
		
		case 2:
			System.out.println("List of all active courses");
			System.out.println(filterList(course, isActive()));
		break;
		
		case 3:
		System.out.println(filterList(course, isInActive()));
		break;
		
		/*
		case 4:
			break;
			
		case 5:
			break;
			
		case 6:
			break;
			
		*/
		case 7:
			break;
		
			default:
				System.out.println("Enter valid choice");
		}
	 }

	private static List<Courses> filterList(List<Courses> course, Predicate<Courses> predicate) {
			// TODO Auto-generated method stub
			return course.stream().filter(predicate).collect(Collectors.<Courses>toList());
		}

	public static Predicate<Courses> isActive(){
		return a->a.getActive().equals("Yes");
		
	}
	public static Predicate<Courses> isInActive(){
		return b->b.getActive().equals("No");
		
	}

}
