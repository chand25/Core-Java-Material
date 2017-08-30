package javaAssignment_PartA;
import java.util.*;
import java.io.*;

public class ArrayIndex {
    
	
	public void arrTaker(int arrSize, int[] arr) {
		
		
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int option;
	
		
		System.out.println("The start of array manipulation");
		
		do
		{
			System.out.println("......\n");
			System.out.println("Press 0 to Exit\n");
			System.out.println("Press 1 to Add a Number");
			System.out.println("Press 2 to Give Size to Array");
			System.out.println("Press 3 to Search by Index");
			System.out.println("Press 4 to View ArrayList");
			System.out.println("Press 5 to Clear array");
			
			option = input.nextInt();
			
			
			
		}
       while (option >0);
	try {
		System.out.println("access");
	     }catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Exception thrown :" + e );
		}
	}

}
