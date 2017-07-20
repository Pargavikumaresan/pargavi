package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {
	public static void main(String[] args) {
	Candidate c = new Candidate("Nivedha",19,"B.E");
	Candidate c1 = new Candidate("Haniesha",19,"B.E");
	Candidate c2 = new Candidate("Raja",34,"B.E");
	Candidate c3 = new Candidate("Ramu",24,"B.com");
	
	List<Candidate> candidate = new ArrayList<Candidate>();
	candidate.addAll(Arrays.asList(new Candidate[] {c,c1,c2,c3}));
	//System.out.println(filterCandidate(candidate, isBeGraduate()));
	System.out.println(filterList(candidate, isBeGraduate()));
	
 }

private static List<Candidate> filterList(List<Candidate> candidate, Predicate<Candidate> predicate) {
		// TODO Auto-generated method stub
		return candidate.stream().filter(predicate).collect(Collectors.<Candidate>toList());
	}

public static Predicate<Candidate> isBeGraduate(){
	return a->	a.getDegree().equals("B.E");
	
	//return void->10;
	//.return ()->10;
	//.return (int quauntity)->{return 10;}
	//return ()->{return;}
	//return ()->Math.min(5,6);
	//return ()->"Chipmunk";

	
	

	/*public  void display(List list,Predicate predicate)
	 {
		list.stream().filter(predicate).collect(Collectors.toList());
		 
	 }
*/
}
	
}
