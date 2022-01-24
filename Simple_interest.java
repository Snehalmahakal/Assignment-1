import java.util.*;

public class Simple_interest {

	public static void main(String[] args) {
		float p, r, t, simple_interest;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter principal:");
		p=sc.nextFloat();
		
		System.out.println("Enter the rate");
		r=sc.nextFloat();
		
		System.out.println("Enter the time:");
		t=sc.nextFloat();
		
		float interest = (p*r*t)/100;
		
		System.out.println("Simple interest="+ interest);
	}
}
	

/*
Output:-
Enter principal:
1000
Enter the rate
9
Enter the time:
3
Simple interest=270.0
*/