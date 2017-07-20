package com.example6;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			

			        ArrayList<Data> al = new ArrayList<Data>();

			        al.add(new Data(1));
			        al.add(new Data(2));
			        al.add(new Data(3));
			        //printUsefulData(al,Data d->d.value>2);
			      //printUsefulData(al, d->d.value>2;);
			       // printUsefulData(al, (d)->return d.value>2;);
			      //  printUsefulData(al, (Data d)->{return d.value>2;);
			   //  printUsefulData(al,d->d.value>2);
			    //   processList(al, (int a, int b)->System.out.println(a*b); );
			      //.  processList(al, (int a, int b)->System.out.println(a*b) );
			      //.  processList(al, (a, b) ->{  System.out.println(a*b); } );
			        //processList(al, a, b->System.out.println(a*b));
			      //. processList(al, (a, b)->System.out.println(a*b));

			         //INSERT METHOD CALL HERE



	}
	
 //static public void printUsefulData(ArrayList<Data> dataList, Predicate<Data> p){
public static void processList (ArrayList<Data> dataList, Process p){
		   for(Data d: dataList){
			   p.process(d.value,d.value);

		      //  if(p.test(d)) System.out.println(d.value);

		   }

		}


}
