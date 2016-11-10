import java.util.Scanner;

public class Factorial {
	
	public static long factorial (long n)
	{
		if (n == 0 || n == 1) {
	           return 1;
	       } else 
	       {
	           return (n * factorial(n - 1));
	       }//end if
	}// en factorial method
	
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number.");
		int number;
		
		while(!scan.hasNextLong())
		{
			scan.next();
			System.out.println("Please enter a number greater than zero.");
		}//end while
		
		number = scan.nextInt();
		
		System.out.println("The factorial of "+number+" is "+factorial(number));
		
		
		scan.close();
	}//en main method
	//todo: implement a recursive functions whicht gives you the factorial value of a given number
}
