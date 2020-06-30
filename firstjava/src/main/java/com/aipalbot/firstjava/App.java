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
    	
//    int row= 3;
//      int col = 2;
//     int [][] arr = new int[3][2];	
//     int sum = 0;
//     int creditHrs = 0;
//     int sumOfAll =0;
//     for(int i =0; i< row; i++) {
//    	 System.out.println("Current row is :" +i);
//    	 
//      	
//      		for(int j =0; j < col; j++) {
//      			System.out.println("row="+i +", col=" + j);	
//      		Scanner input = new Scanner(System.in);	
//     System.out.println("Enter value for row" + i+ ", col" + j);
//     arr[i][j] = input.nextInt();
//      		}
    	
    	
//     }
//      	// calculate point * credithour	
//     for(int i =0; i< row; i++) {
//    	 int mult = 1;
//    	 for(int j =0; j < col; j++) {
//    		 mult *= arr[i][j];
//    		 if(j==1)
//    	    	  creditHrs += arr[i][j];	 
//    	 
//    	 }
//    	 System.out.println(" Row" + (i +1) + "=" +mult);
//    	    
//         sumOfAll +=mult;
//        
//     }	
//     
//     System.out.println("sum of Credit point * creditHrs"  + sumOfAll);
//
//      
//  System.out.println("sum of Credit Hour"  + creditHrs);
// 
//  double gpa = sumOfAll/creditHrs;
// 
//  System.out.println("Sum of GPA:" + gpa);
 
    	
    	
//    	int a;
//    	int b;
//    	Scanner input = new Scanner(System.in);
//    	
//    	System.out.println("Enter value for row of matrix");
//    	a  = input.nextInt();
//    	
//    	System.out.println("Enter value for col of matrix");
//    	b  = input.nextInt();
//    	
//    	int arr1[][] = new int[a][b];
//    	int arr2[][] = new int[a][b];
//    	int mult[][]  = new int[a][b];
//    	int mult1[][]  = new int[a][b];
//         int sum[][]  = new int[a][b];
//    	
//    	
//    	System.out.println("Enter first matrix");
//    	for(int i =0; i<a; i++) 
//    		
//    		for(int j =0; j<b; j++) 
//    			arr1[i][j] = input.nextInt();
//    			
//    	System.out.println("Enter second matrix");	
//    			
//     for(int i =0; i<a; i++) 
//    	    		
//      for(int j =0; j<b; j++) 
//   arr2[i][j] = input.nextInt();
//    			
//    for(int i =0; i<a; i++) 
// 		
// 		for(int j =0; j<b; j++) 
// 			mult[i][j] = arr1[i][j] * arr2[i][j] ;
//         
//    System.out.println("mult of the matrix:-");
//     
//     for(int i =0; i<a; i++) {
// 		
// 		for(int j =0; j<b; j++) 
// 		
// 			System.out.println(sum[i][j]+ "\t");
// 			System.out.println();
    		//}
    	
    	
    	int a= 2;
    	int a1 =2;
    	int b =2;
    	int b1 = 2;
    
    	
    	
    	int[][] matrixA= {{5,8},{7, 2}};
    	int[][]  matrixB ={{3,1},{2,4}};
    	
    	//Multiplying
    	
    	int[][] arr = multiplyMatrix(matrixA, matrixB, a, b, b1);
    		
    	displayArr(arr);
    	
		
		
	}

	public static int [][] multiplyMatrix(int[][] matrixA,int[][] matrixB,int a, int b, int b1 ){
		
		int[][] arr =new int[a][b1];
		for(int i = 0; i< a; i++) {
			for(int j = 0; j < b; j++) {
				for(int k = 0; k < b1; k++) {
					
					arr[i][j] += matrixA[i][k] * matrixB[k][j];
				}
				
			}
		}
		
		return arr;
	}
	
	public static void displayArr(int[][] arr) {
		System.out.println(" The result of Two matric is :-");
		
		
		 for(int[] row : arr) {
			 
			 for(int colum : row) {
			 
			 System.out.print(colum + "    ");
		 }
			 System.out.println();
		
		 }
		
	}
	}
    		
    	
    	

    
   
     
     	
    
      
       
    
     
    
   

 
	
