package com.suntechnoservices.vedikas.test;


/*
* The Test project implements an application that
* simply displays prime numbers upto 20 to the standard output.
*
* @author  Praveen Kumar
* @version 1.0
* @since   2020-02-19 
*/

public class Test {

	public static void main(String[] args) {
		
		 int i =0;
	       int num =0;
	       //Empty String
	       String  primeNumbers = "";

	       for (i = 1; i <= 20; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime Numbers from 1 to 20 are :");
	       System.out.println(primeNumbers);
	       
	       // Array program
	       Venue list = new Venue();
	       System.out.println(list.venues[0]);
	       
	       //Hashmap
	       Services priceList = new Services();
	       System.out.println(priceList.pack.size());
	       
	       //Arraylist
	       Cattering listing = new Cattering();
	       System.out.println(listing.items.size());
	       
	       //Linkedlist
	       Cities lists = new Cities();
	       System.out.println(lists.cityName);
	}
}
