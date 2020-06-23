package com.aipalbot.firstjava;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    { 
    	
    	
    
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
     
    double discount = (percentage/100.00) * totalPrice;
     
   System.out.println(" discount is: " + discount);
    
   
   Scanner scanner2 = new Scanner(System.in);
   
    System.out.println("Enter your Promocode:");
  String promoCode = scanner2.nextLine();
    System.out.println(" your promocode : \n" + promoCode);	
    	
    
    scanner2.close();
    	scanner.close();
    	
    if(totalPrice > 200.00 && promoCode.equals("Summer2020")) {
    	totalPrice = totalPrice-discount;
    }
     
   
   System.out.println(totalPrice);
    	
    }
    
   
}
 
	
