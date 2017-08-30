package javaAssignment_PartA;
import java.util.Scanner;
import java.io.*;

public class ArrayIndexScannerProgram {
	
	

public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		// TODO Auto-generated method stub
	
	int[] arrProgram;
	int selectedIndex;
	int arrSize;
	int arrIndex;
	
	Scanner  input = new Scanner(System.in);
		//get number from user to get how big the array will be 
	     System.out.println("Enter how big you want it");
		  arrSize = input.nextInt();
		  arrProgram = new int [arrSize];
		
		//fill array with user inputs and on every turn ask for input  
	    for (int i=0; i<arrSize; i++) 
	    {
	    	System.out.println("Enter a Number");
	    	arrProgram[i] = input.nextInt();
	    }
	    
	      Scanner indexInput = new Scanner(System.in);
		  System.out.println("Enter an Index");
	    	arrIndex = indexInput.nextInt();
		  selectedIndex = arrProgram[arrIndex];
		   System.out.println(selectedIndex);
		try {
			System.out.println(arrProgram[arrSize+1]);
			System.out.println("Access denied: Index is bigger than size");
		     }catch(ArrayIndexOutOfBoundsException e) {
		    	 e.printStackTrace();
			System.out.println("Exception thrown :" + e );
			}
		
		
		}


}
