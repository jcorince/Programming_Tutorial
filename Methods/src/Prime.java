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
		
		int number;
		
		System.out.println("Please enter a number");
		
		do
		{
			while(!scan.hasNextInt()) 
			{
			    scan.next();
			    System.out.println("Please make sure the entered number is an integer greater than zero.");
			}
			
			number=scan.nextInt();
			
			if (number<0)
			{
				System.out.println("Please enter a value greater than 0");
			}//end if
			
		}while(number<0);//end do while
		
		isPrime(number);
		
		scan.close();
		
		//todo: write a method which tells you if a given number is a prime or not
		
	}// end main method
	
	
	
}
