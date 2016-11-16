import java.util.Scanner;

//loops

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number;
		System.out.print ("Please enter a number: ");
		do
		{
			while(!scan.hasNextInt())
			{
				scan.next();
				System.out.println("The number must be an integer.");
			}//end while
			number = scan.nextInt();
			if(number<0)
			{
				System.out.println("The number greater than zero.");
			}//end if			
		}while(number<0);//end do while
		
		
		
		System.out.println ("The odd numbers between 0 and "+number+ " are: ");
		for (int i=1;i<=number;i++)
		{
			if (i%2!=0)
			{
				System.out.println (i);
			}//end if
		}//end for 
		
		scan.close();
		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
		
	}//end main
	
}//end class
