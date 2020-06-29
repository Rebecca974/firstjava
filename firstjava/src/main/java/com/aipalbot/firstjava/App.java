package com.aipalbot.firstjava;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Hello World!
 *
 */
public class App 
{
    public static void main( String[] args )
    { 
    	
    int row= 3;
      int col = 2;
     int [][] arr = new int[3][2];	
     int sum = 0;
     int creditHrs = 0;
     int sumOfAll =0;
     for(int i =0; i< row; i++) {
    	 System.out.println("Current row is :" +i);
    	 
      	
      		for(int j =0; j < col; j++) {
      			System.out.println("row="+i +", col=" + j);	
      		Scanner input = new Scanner(System.in);	
     System.out.println("Enter value for row" + i+ ", col" + j);
     arr[i][j] = input.nextInt();
      		}
     }
      	// calculate point * credithour	
     for(int i =0; i< row; i++) {
    	 int mult = 1;
    	 for(int j =0; j < col; j++) {
    		 mult *= arr[i][j];
    		 if(j==1)
    	    	  creditHrs += arr[i][j];	 
    	 
    	 }
    	 System.out.println(" Row" + (i +1) + "=" +mult);
    	    
         sumOfAll +=mult;
        
     }	
     
     System.out.println("sum of Credit point * creditHrs"  + sumOfAll);

      
  System.out.println("sum of Credit Hour"  + creditHrs);
 
  double gpa = sumOfAll/creditHrs;
 
  System.out.println("Sum of GPA:" + gpa);
 
   
     }
     	
    
      
       }
    
     
    
   

 
	
