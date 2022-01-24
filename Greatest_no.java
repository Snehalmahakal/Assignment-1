/*
WAP to accept two no from user and find out the greatest.
*/

import java.util.*;
public class Greatest_no {

	public static void main(String[] args) {
		int num1 ,num2;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println("Enter number1 is greater number="+num1);
		}
		
		else
		{
			System.out.println("Enter number2 is greater number="+num2);
		}

	}

}


Output:-
Enter two numbers:
55
62
Enter number2 is greater number=62

