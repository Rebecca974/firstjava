package com.aipalbot.firstjava;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    { 
    	
    	int totalPrice;
    	int quantity = 3;
    	int costPerItem = 7;
    	int discountCheck = 17;
    	totalPrice = quantity * costPerItem;
    	
    	System.out.println("before discount" + totalPrice);
    	
    	if(totalPrice > discountCheck) {
    		int newTotal =totalPrice;
    		newTotal -= costPerItem;
    		
    		//totalPrice = totalPrice - costPerItem;
    		
    		System.out.println("after discount " + newTotal);
    	}
    	
    	
    	//System.out.println("after discount " + totalPrice);
    	//I am a programmer
       /* This is my first programming and I glad to face any challenging that is coming my way*/
    	
    	//System.out.println( "Welcome to Java Programing!" );
   
    
  //Assignment
    /* 
     * Calculate the total price of 8 items at $3 each and subtract the cost of 2 items from the total price, 
     * if total price is more than $20
     * Display the amount to be paid after discount
     */
    
    int totalPrice1;
    int item = 8;
    int price = 3;
    int discount = 20;
    
    
    totalPrice1 = item * price;
    System.out.println("The totalPrice is:" + totalPrice1);
    
     
    if (totalPrice1> discount) {
    	
    	totalPrice1-= price + price;	
    	
    		
    		System.out.println("The totalPrice after discount is: " + totalPrice1);
    	}
    
    
}
}