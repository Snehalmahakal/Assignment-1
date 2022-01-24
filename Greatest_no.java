/*
WAP to accept two no from user and find out the greatest.
*/

import java.util.*;
public class Greatest_no {

	public static void main(String[] args) {
		int num1 ,num2;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter two numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println("number 1 is greater number="+num1);
		}
		
		else
		{
			System.out.println("number 2 is greater number="+num2);
		}

	}

}

Output:-
enter two numbers:
54
32
number 1 is greater number=54

