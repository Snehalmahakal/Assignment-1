import java.util.*;
public class Area_perimeter {

	public static void main(String args[]) {
		        Scanner sc=new Scanner(System.in);
		        
		        float length,width,area, perimeter ;
		        
		        System.out.println("Enter the length of rectangle:");
		        length=sc.nextInt();
		        
		        System.out.println("Enter the width of rectangle:");
		        width=sc.nextInt();
		        
		        area =  (length * width);
		        perimeter = 2*(length + width);
		        		
		        System.out.println("area of rectangle is="+area);
		        System.out.println("perimeter of rectangle="+perimeter);
		    }
		}

/*
Output:-
Enter the length of rectangle:
5
Enter the width of rectangle:
7
area of rectangle is=35.0
perimeter of rectangle=24.0

*/
