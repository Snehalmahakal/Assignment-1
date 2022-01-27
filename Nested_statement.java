import java.util.*;
public class Nested_statement {

	public static void main(String[] args) {
		
		   int num;
		  
		   Scanner sc=new Scanner(System.in);
		   
		   System.out.println(" 1.Even Odd 2.Greater between three no 3.check vowel or not 4.display day");
		   System.out.println("Enter your choice from above");
		   num=sc.nextInt();
		   
		   switch(num)
		   {
		   case 1:
			   int n1;
			System.out.println("Enter Number ");
			n1=sc.nextInt();
			if(n1%2==0)
			{
				System.out.println("Number is Even");
			}
			else
			{
				System.out.println("Number is Odd");
				
			}
			break;
			
		   case 2:
			   int x,y,z;
			   System.out.println("Enter Three Numbers ");
			   x=sc.nextInt();
			   y=sc.nextInt();
			   z=sc.nextInt();
			   if (x>y && x>z)
			   {
				   System.out.println("Greater number is:"+x);

			   }
			   else if(y>x && y>z)
			   {
				   System.out.println("Greater number is:"+y);
				   
			   }
			   else if(z>x && z>y)
			   {
				   System.out.println("Greater number is:"+z);
			   }
			   else 
			   {
				   System.out.println("Please enter integer number");
			   }
			   break;
			   
		   case 3:
			   char ch;
			   System.out.println("Enter a character ");
			   ch=sc.next().charAt(0);
			   if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
			   {
				   System.out.println("It is a Vowel ="+ch);
			   }
			   else
			   {
				   System.out.println("It is not a Vowel ="+ch);
			   }
			   break;
			   
		   case 4: 
			   int n;
			   System.out.println("Enter number from 1 to 7");
			   
			   n=sc.nextInt();
			   switch(n)
			   {
			   case 1:
				   System.out.println("Monday");
				   break;
			   case 2:
				   System.out.println("Tuesday");
				   break;
				   
			   case 3:
				   System.out.println("Wednsday");
				   break;
			   case 4:
				   System.out.println("Thursday");
				   break;
			   case 5:
				   System.out.println("Friday");
				   break;
			   case 6:
				   System.out.println("Saturday");
				   break;
			   case 7:
				   System.out.println("Sunday");
				   break;
				   default:
					   
					   System.out.println("Invalid Choice");
					   break;
				   
			   }
			   
		   }
		   
			}
		}


/*
Output:-
1.Even Odd 2.Greater between three no 3.check vowel or not 4.display day
Enter your choice from above
4
Enter number from 1 to 7
2
Tuesday
*/

	