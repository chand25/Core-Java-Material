package javaAssignment_PartC;

import java.util.Scanner;


public class Main_Program {

	

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Scanner  input = new Scanner(System.in);
		
		System.out.println("Enter the range");
		int startValue = input.nextInt();
		int endValue = input.nextInt();
		
	//creating two new threads...one for even & one for odd
	Number_Program oddThreadingIt = new Number_Program("Odd", startValue, endValue);
	Number_Program evenThreadingIt = new Number_Program("Even", startValue, endValue);
	
	//start threads
	oddThreadingIt.start();
	evenThreadingIt.start();
	
	oddThreadingIt.join();
	evenThreadingIt.join();
	
	System.out.println("Odd numbers in given range");
	oddThreadingIt.display();
	System.out.println("Even numbers in given range");
	evenThreadingIt.display();
	
	input.close();
	}

}
