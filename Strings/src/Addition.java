import java.util.Scanner;

//beginner

public class Addition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter an integer");
		int num1 = scan.nextInt();
		int sum;
		do
		{
			System.out.println("Please enter another integer");
			sum = num1+ (scan.nextInt());
		}while ((scan.next()!='s'));
		
		System.out.println("The result is "+ sum);
		
		
		//todo: Read integer values as input and add them until the user writes a 's'.
		//Print the result.
		
	}
	
}
