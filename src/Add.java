import java.util.Scanner;

public class Add {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);

		int a, b, c;
		System.out.println("Enter the value to Add numbers:");
		a=input.nextInt();
		b=input.nextInt();
		c=a+b;
		
		System.out.println("enter the value to add =" +c);
		
	}

}
