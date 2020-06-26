package com.aipalbot.firstjava;

import java.util.Scanner;

/**
 * Hello World
 *
 */
public class App 
{
    public static void main( String[] args )
    { 
    	
    	
  
    int studentName =1; 
    	 	
   Scanner  scan = new Scanner(System.in);
  
   System.out.println("Enter Student" + studentName++ + " ' name :");
  String  Name = scan.next();
    
 System.out.println("Enter Grade here ");
  int average = scan.nextInt();
 
 char grade;
    
  if(average >= 86 && average <= 100) {
    	grade = 'A';
    }
  else if(average >= 70 && average <= 85) {
  	grade = 'B';
	
  }
  else if(average >= 60 && average <= 69) {
  	grade = 'C';
  }
  else if(average >= 50 && average <= 59) {
  	grade = 'D';
	
  }
  else if(average >= 40 && average <= 49) {
  	grade = 'E';
  	
  }   
  else {
	  grade = 'F';
	  
	  }
  switch(grade) {
  
  case 'A':
 	System.out.println("Excellent!");
 	break;
  case 'B':
  	System.out.println("Very Good");
  	break;
  case 'C':  	
	  System.out.println("Good");
 	break;  	
  case 'D':
  	System.out.println("Pass");
      break;
  case 'E':
	System.out.println("Fair");
 	break;  
	   case 'F':
  	System.out.println(" Your Grade is Below 25 " + "Better try again");
     break; 
     default:
     
 	System.out.println("Better try again"); 
	   
}
  System.out.println("Your grade is: " + grade);
  }
    }

   

 
	
