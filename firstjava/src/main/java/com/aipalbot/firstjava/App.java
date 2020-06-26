package com.aipalbot.firstjava;

import java.util.Scanner;

/**
 * Hello World!
 *
 */
/*Give 10% discount as a promo, if the promocode is 
 * Summer2020 and total cost of all items is more than $200	

 double totalPrice;
double percentage =10;


Scanner scanner = new Scanner(System.in);

System.out.println("Enter quantity:");
int quantity = scanner.nextInt();
System.out.println("Enter value for quantity: " + quantity);
System.out.println("Enter Price :");
int price = scanner.nextInt();
System.out.println("Enter value for Price: " + price);

totalPrice = quantity* price;
System.out.println("The totalPrice is:" + totalPrice);
 
Scanner scanner2 = new Scanner(System.in);
System.out.println("Enter your Promocode:");
String promoCode = scanner2.nextLine();
System.out.println(" your promocode : \n" + promoCode);	
	
scanner2.close();
scanner.close();
	
if(totalPrice > 200.00 && promoCode.equals("Summer2020")) {
   double discount = (percentage/100.00) * totalPrice;
	totalPrice = totalPrice-discount;
	 System.out.println(" discount is: " + discount);
	}

System.out.println(totalPrice);*/
	
	
	
//For every item with cost price higher than $5, add 5% to each item
	
//	double costOfPrice = 10.0;
//	double item =4.0;
//	double percentage = 5.0;
//	double total;
//	
//	total = item * costOfPrice;
//System.out.println("The totalPrice is:" + total);
//   
//  if (total > costOfPrice ) {
//	  
//	  double totalCost = (percentage/100.00) * total;
//  	
//	  total = total-totalCost;
//	  System.out.println("Add 5%  cost of item:" + total);

//Requirement : As a user I want to be able to print  the Gade of my Student using grading scemes to see their result
// hint : if score = 25 print f
//int count;
//float score =0;
//float percentage;
//float average ;
//int studentNumber =1;
//
//
//Scanner  scan = new Scanner(System.in);
//
//System.out.println("Enter Student" + studentNumber++ + " 'scan name :");
//String  studentName = scan.next();
//
//System.out.println("Enter Number of the Subject ");
//count = scan.nextInt();
//
//System.out.println("Enter Scores of " + count + "Subject");
//for(int i =0; i < count; i++){
//	score += scan.nextInt();
//	
//}
//System.out.println("Total Grade is" + score);
//percentage = (score/(count*100) * 100);
//
//switch((int) percentage / 10) {
//case 9:
//	System.out.println("Grade : A+");
//	break;
//case 8:
//	System.out.println("Grade : A");
//	break;
//case 7:
//	System.out.println("Grade : B");
//	break;  	
//case 6:
//	System.out.println("Grade : C");
//    break;
//case 5:
//	System.out.println("Grade : D");
//	break;  
//case 4:
//	System.out.println("Grade : E");
//    break; 	
//case 3:
//	System.out.println("Grade : F");
//	break;    
//	
//}
//
//




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
  	System.out.println(" Very very very Poor");
     break; 
     default:
     
 	System.out.println("Better try again"); 
	   
}
  System.out.println("Your grade is: " + grade);
  }
    }

   

 
	
