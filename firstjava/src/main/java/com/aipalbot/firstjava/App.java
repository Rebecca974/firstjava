package com.aipalbot.firstjava;

import java.text.DecimalFormat;
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
    	
    	
  
//    int studentName =1; 
//   	 	
//   Scanner  scan = new Scanner(System.in);
//  
//   System.out.println("Enter Student" + studentName++ + " ' name :");
//  String  Name = scan.next();
//    
// System.out.println("Enter Grade here ");
//  int average = scan.nextInt();
// 
// char grade;
//    
//  if(average >= 86 && average <= 100) {
//    	grade = 'A';
//    }
//  else if(average >= 70 && average <= 85) {
//  	grade = 'B';
//	
// }
//  else if(average >= 60 && average <= 69) {
//  	grade = 'C';
//  }
//  else if(average >= 50 && average <= 59) {
// 	grade = 'D';
//	
// }
//  else if(average >= 40 && average <= 49) {
//  	grade = 'E';  	
//  }   
//  else {
//	  grade = 'F';
//	  
//	  }
//  switch(grade) {
//  
//  case 'A':
// 	System.out.println("Excellent!");
// 	break;
//  case 'B':
// 	System.out.println("Very Good");
// 	break;
// case 'C':  	
//	  System.out.println("Good");
// 	break;  	
// case 'D':
//  	System.out.println("Pass");
//      break;
//  case 'E':
//	System.out.println("Fair");
// 	break;  
//	   case 'F':
// 	System.out.println(" Very very very Poor");
//    break; 
//     default:
//     
// 	System.out.println("Better try again"); 
//	   
//}
//  System.out.println("Your grade is: " + grade);
    	
    	
    	
    	//As a user I want to be able to see the total sum of items showing  their sum of 
    	
//    String[] itemNames = new String[5];
//      int size = itemNames.length;
//      double [] itemPrices = new double[size];
//      int[] itemQuantities = new int[size];
//      double[] totalCostPerItems = new double[size];
//      
//      double totalAmount = 0.0;
//      
//     
//      
//      for(int i = 0; i< size; i++) {
//      	int header =i+1;
//      	System.out.println("************************item"+ header +"********************");
//      	 
//      	Scanner input = new Scanner(System.in);
//      	System.out.println("Enter Item Name:");
//      	String itemName = input.nextLine();
//    	itemNames[i]= itemName;
//      	
//      	
//      	System.out.println("Enter Item Quantity:");
//      	int itemQuantity = input.nextInt();
//     	itemQuantities[i]= itemQuantity;
//      	
//      	System.out.println("Enter Item Price:");
//      	double itemPrice = input.nextDouble();
//      	itemPrices[i]= itemPrice;
//      	
//      	double totalCostPerItem = itemQuantity * itemPrice;
//      	totalCostPerItems[i] = totalCostPerItem;
//      	
//     	
//      	totalAmount +=totalCostPerItem;
//      }
//      	
//      	System.out.print("itemName + \t|");
//      	System.out.print("itemPrice +\t|");
//      	System.out.print("itemQuantity +\t|");
//      	System.out.println("totalCostPerItem +\t|");
//      
//      	for(int i = 0; i< size; i++) {
//      		
//    		System.out.print(itemNames[i] +"\t|");
//          	System.out.print(itemPrices[i] +"\t|");
//          	System.out.print(itemQuantities[i] +"\t|");
//          	System.out.println(totalCostPerItems[i] +"\t|");
//          	
//      	}	
//      	
//      	DecimalFormat dFormat = new DecimalFormat("####,###,###.00");
//      	String formatTotalAmount = "$" + dFormat.format(totalAmount);
//      	
//     	System.out.println("Total Amount:" + formatTotalAmount);
      	
     	
     	int matRow = 2;
     	int matCol = 3;
     	int [][] matA = new int[matRow][matCol];
     	
     	int size = matA.length;
     	System.out.println(size);
     	
     	/*|6 9 8|
     	 *|2 7 9|
     	 * 
     	 * 
     	 */
     	
     	for(int row =0; row < size; row++) {
     	System.out.println("current row is" + row);
     		
     	
     	for(int col =0; col < matCol; col ++) {
     		//matA[row][col]
     	 System.out.println("row="+ row+", col=" + col);
      Scanner input = new Scanner(System.in);
      System.out.println("Enter value for for Row" + row + ",col" + col);
     matA[row][col] = input.nextInt();
     		}
     	}
     	
     for(int row =0; row < size; row++) {
     	System.out.print("|");
     		for(int col =0; col < matCol; col++) {
     			System.out.print(matA[row][col]+ "\t");
     			}
     		System.out.println("|");
     		}
     	
     for(int row =0; row < size; row++) {
    	 int sumOfRow = 0;
      	
      		for(int col =0; col < matCol; col++) {
      			sumOfRow += matA[row][col];
      		
     }
      		System.out.println("Sum of row" + row + "=" +sumOfRow);
      		}
     	
     /*
      * 
      * 
      * */
     
     
     
     
     
     
     
     
     
     
     
    }
    
    
    
    
    
    
    	
   
  }
    
   

 
	
