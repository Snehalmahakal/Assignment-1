import java.util.*;
class pro2
{
public static void main(String args[])
{
int num1, num2, sum, sub, mul, mod;
float div;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first num");
num1=sc.nextInt();
System.out.println("Enter second num");
num2=sc.nextInt();
sum=num1+num2;
System.out.println("Addition is ="+sum);
sub=num1-num2;
System.out.println("Substraction is ="+sub);
mul=num1*num2;
System.out.println("Multiplication is ="+mul);
div=num1/num2;
System.out.println("Division is ="+div);
mod=num1%num2;
System.out.println("Modulas is ="+mod);
}
}