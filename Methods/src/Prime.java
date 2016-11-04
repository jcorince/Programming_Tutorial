import java.util.Scanner;


public class Prime {
	
	public static void isPrime(int n)
	{
		int result = 0;
		
		for(int i=2; i<n;i++)
		{
			if (n%i==0)
			{
				result = 1;
			}
		}//end for				
				
		if (result == 1)
		{
			System.out.println (n+" is not prime");
		}else 
		{
			System.out.println (n+" is prime");
		}//end if
		
		
	}//end isPrime method
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int number=scan.nextInt();
		
		isPrime(number);
		
		scan.close();
		
		//todo: write a method which tells you if a given number is a prime or not
		
	}// end main method
	
	
	
}
