package circle;

import java.util.Scanner;

public class Circle_area {

	public static void main(String[] args) {
	
		 double radius,circumference,area;
		 double pi=3.14;
		 Scanner sc = new Scanner(System.in);
							
		 System.out.println(" Enter Radius of Circle");
		 radius=sc.nextDouble();
			
		 area = pi*radius*radius;
		 circumference = 2*pi*radius;
		 
							
		 System.out.println("Area of Circle:" + area);
		 System.out.println("Circumference of Circle:" + circumference);
					}
				}


/*
Output:-
Enter Radius of Circle
3
Area of Circle:28.259999999999998
Circumference of Circle:18.84
*/
	


