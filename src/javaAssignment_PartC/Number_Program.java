package javaAssignment_PartC;
import java.util.*;

public class Number_Program extends Thread{
 int start, end;
 String numberType;
 List<Integer> numberList;
	
	public Number_Program(String numberType, int start, int end) {
		this.start = start;
		this.end = end;
		this.numberType = numberType;
		this.numberList = null;
	}
    
	
//function to check if number is even then add to arraylist	
	public void checkedEven() { 
		if(this.numberType=="Even") {
			this.numberList = new ArrayList<Integer>();
			for(int i = start; i<=end; i++) {
				if(i%2==0) {
					this.numberList.add(i);
				}
			}
		
		}
	 }	
	
	//function to check if number is odd then add to arraylist	
	public void checkedOdd() { 
		if(this.numberType=="Odd") {
			this.numberList = new ArrayList<Integer>();
			for(int i = start; i<=end; i++) {
				if(i%2!=0) {
					this.numberList.add(i);
				}
			}
		
		}
	 }	


	//override run function
	//switch statement to compare numberType status
	@Override
	public void run(){
		
		switch(numberType) {
		 case "Even":
			 checkedEven();
			 break;
		 case "Odd":
			 checkedOdd();
			 break;
		default:
			break;
		}
	}
	
	//for each item in array list display
	public void display() {
		for(Integer i: numberList) {
		//for(int i =0; i<numberList.size(); i++) {
		System.out.println(i);
		}
	}

}
