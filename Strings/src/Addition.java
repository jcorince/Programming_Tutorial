import java.util.*;

//beginner

public class Addition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		
		int num1, num2;
		String intent;
		int test = 0;
		int sum = 0;
		
		System.out.println("Enter an integer");
		
		do
		{
			while(!scan.hasNextInt())
			{
				scan.next();
				System.out.println("You must enter an integer.");
			}//end while loop
			num1 = scan.nextInt();
			if(num1<0)
			{
				System.out.println("The integer must be positive.");
			}//end if
		}while(num1<0);	//end do while loop	
		
		sum += num1;
		
		while(test == 0)
		{			
			System.out.println("Enter another integer");
			
			do
			{
				while(!scan.hasNextInt())
				{
					scan.next();
					System.out.println("You must enter an integer.");
				}//end while loop
				num2 = scan.nextInt();
				if(num2<0)
				{
					System.out.println("The integer must be positive.");
				}//end if
			}while(num1<0); //end do while
			
			sum += num2;
			
			do
			{
				System.out.println("Enter y to continue or s to display the sum of all previously entered numbers and exit the program.");
			
				intent = scan.next();
				//System.out.println("Intent is now "+intent);
				
				if (intent.equalsIgnoreCase("s"))
				{
					System.out.println("The result is "+ sum);
					System.exit(-1);
				}else if (intent.equalsIgnoreCase("y"))
				{
					break;
				}else
				{
					System.out.println("You must enter either y or s only.");					
				}//end if;
				
			}while ((!intent.equalsIgnoreCase("s"))||(!intent.equalsIgnoreCase("y")));//end do while 			
			
		}//end while	
		
		scan.close();
		
		//todo: Read integer values as input and add them until the user writes a 's'.
		//Print the result.
		
	}//end main method
	
}//end addition class