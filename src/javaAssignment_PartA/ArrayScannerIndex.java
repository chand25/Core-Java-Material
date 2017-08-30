package javaAssignment_PartA;

import java.util.Scanner;
import java.io.*;

  

public class ArrayScannerIndex {
	 
	int[] arrProgram;
	int selectedIndex;
	
	//make a constructor that will be initialized when new object is made

	ArrayScannerIndex(int arrSize){
		//scanner read user inputs
		 Scanner input = new Scanner(System.in);
		  arrProgram = new int[arrSize];
	    
	    for (int i=0; i<arrSize; i++) 
	    {
	    	System.out.println("Enter a Number");
	    	arrProgram[i] = input.nextInt();
	    }
	    
	  }
	
	public int arrPicker() {
		int arrIndex;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an Index");
	    	arrIndex = input.nextInt();
		selectedIndex = arrProgram[arrIndex];
		System.out.println(selectedIndex);
		
		try {
			if(arrIndex >= arrProgram.length) {
	  		System.out.println("access");}
	  	     }catch(ArrayIndexOutOfBoundsException e) {
	  	    	e.printStackTrace();
	  		  System.out.println("Exception thrown :" + e );
	  		}
	    return selectedIndex;
	}
	  
	
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		// TODO Auto-generated method stub
		
	ArrayScannerIndex fun = new ArrayScannerIndex(3);
      fun.arrPicker();
      
  	}
       
	}


