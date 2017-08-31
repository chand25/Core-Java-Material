package javaAssignment_PartB;
import java.io.*;


public class Transformers {

	int currX, currY;
	
	//use constructor to initialize variables to 0 
	//so every time new object is created it reset
	Transformers(){
		this.currX =0;
		this.currY =0;
	}
	
	//setting out 4 functions which would show movement across grid
	//basic movements of Up, Down, Left, Right
	public void moveLeft(){
		currX-=1;
	}
	
	public void moveRight(){
		currX+=1;
	}
	
	public void moveUp(){
		currY+=1;
	}
	
	public void moveDown(){
		currY-=1;
	}
	public static void main(String[] args) throws IOException{
	   //letting user know to enter input
		System.out.println("Controller of Destiny: Enter combination of U for Up, D for Down, L for Left, R for Right");
		
		//created an InputStreamReader object and wrraped it into a newly created BufferedReader object
		//InputStreamReader(inputStream)
		//docs.oracle.com/javase/8/docs/api/java/io/InputStreamReader.html#read
		/*BufferedReader -Reads text from a character-input stream, buffering characters 
		 * so as to provide for the efficient reading of characters, arrays, and lines.
		 * 
		 */
	    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		String directions = bufferRead.readLine();
		
		//create a new Transformers object coordinates starting at (0,0)
		Transformers autobotsRollOut = new Transformers();
		
		//if string length is greater than 0 but less than or equal to 10 then
		//check each letter of string using charAt method
		if(directions.length()>0 && directions.length()<=10) {
			 for(int i=0; i <directions.length();i++) {
			//charAt method returns the character located at the String's specified index.
		    //we can look at character to determine autobots movement
				char whereTo = directions.charAt(i);
				
				//switch - check status of each character to determine which function to do based on letter
				 switch(whereTo) {
				 case 'L':
					 autobotsRollOut.moveLeft();
					 break;
				 case 'R':
					 autobotsRollOut.moveRight();
					 break;
				 case 'U':
					 autobotsRollOut.moveUp();
					 break;
				 case 'D':
					 autobotsRollOut.moveDown();
					 break;
				 default:
				     break;
				 }
					
			   }
			 System.out.println("(" + autobotsRollOut.currX + "," + autobotsRollOut.currX +")");
		     }
			 else if(directions.length()==0) {
				 System.out.println("Please tell me where to go."); 
			 }else {
				System.out.println("I will not be able to make it that far.");
		  }
			
			
	}

}
