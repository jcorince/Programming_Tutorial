import java.util.Scanner;

public class Fibonacci {
	
	public static long fibonacci (int n)
	{
		if (n == 0) {
	           return (0);
	       } else if (n == 1)
	       {
	    	   return (1);
	       }else
	       {
	           return ((fibonacci(n-1))+ (fibonacci(n-2)));
	       }//end if
	}// end fibonacci method
	
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number.");
		int number;
		
		do
		{
			while(!scan.hasNextInt())
			{
				scan.next();
				System.out.println("Please enter a number greater than zero.");
			}//end while
			
			number = scan.nextInt();
			
			if(number<0)
			{
				System.out.println("Please enter a value greater than 0");
			}//end if
		}while(number<0);//end do while
		
		
		
		System.out.println("The fibonacci number of "+number+" is "+fibonacci(number)+".");
		
		
		scan.close();//closing scanner
	}//end main method
	
	
	
	//todo: implement a recursive function which takes an integer value as inputs and outputs the corresponding Fibonacci number.
	//if you don't know what Fibonacci numbers are you can read it here: https://en.wikipedia.org/wiki/Fibonacci_number
}
