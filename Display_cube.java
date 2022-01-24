/*
WAP to accept a no from user if no is divide by 5 then display the cube.
*/

import java.util.Scanner;
public class Display_cube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the number:");
		num = sc.nextInt();
		
	        if (num%5==0)
	        
	        {
	            System.out.println("yes \n"+ num + " is divisible by 5");
	            System.out.println("number is : " +num +" and cube of " +num +" is : "+(num*num*num)); 
	        }
	        
	        else
	        {
	            System.out.println("no,is not divisible by 5");
	        }
	}

}


	
	
Output:-
Enter the number:
35
yes 
35 is divisible by 5
number is : 35 and cube of 35 is : 42875
