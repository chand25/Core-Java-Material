package javaAssignment_PartA;
import java.util.Scanner;


public class ArrayIndexScannerProgram {
	
	

public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		// TODO Auto-generated method stub
	
	int[] arrProgram;
	int selectedIndex;
	int arrSize;
	int arrIndex;
	
	Scanner  input = new Scanner(System.in);
		//get number from user to get how big the array will be 
	     System.out.println("Enter how big you want Array");
		  arrSize = input.nextInt();
		  arrProgram = new int [arrSize];
		
		//fill array with user inputs and on every turn ask for input  
	    for (int i=0; i<arrSize; i++) 
	    {
	    	System.out.println("Enter a Number");
	    	arrProgram[i] = input.nextInt();
	    }
	    
	      //asking user to input an index
		  System.out.println("Enter an Index");
		     arrIndex = input.nextInt();
		  //if user input for index is bigger than array size then try block is called  
		   try {
			   if(arrIndex>arrSize) {
			   System.out.println("Access denied: Index is bigger than size");
			   }
			  }catch(ArrayIndexOutOfBoundsException e) {
		    	 e.printStackTrace();
			System.out.println("Exception thrown :" + e );
			}
		   //if try/catch is not ran then the rest of code is continued
		   selectedIndex = arrProgram[arrIndex];
		   System.out.println(selectedIndex);
		//close scanner to prevent memory leak
		 input.close();
		}


}
