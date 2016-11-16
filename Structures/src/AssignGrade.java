import java.util.Scanner;

//if-else

public class AssignGrade {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double score;
		
		System.out.print("Enter a score: ");
		
		do
		{
			while(!scan.hasNextDouble())
			{
				scan.next();
				System.out.println("The entered value must be an integer.");
			}//end while						
			score = scan.nextDouble();
			if(score<0)
			{
				System.out.println("The entered integer must be greater than or equal to zero.");
			}//end if
		}while(score<0);//end do while
		
		if (score<50.0)
		{
			System.out.println("The grade is 5.0");
			
		}else if (score>=50.0 && score<54.0)
		{
			System.out.println("The grade is 4.0");
			
		}else if (score>=54.0 && score<58.0)
		{
			System.out.println("The grade is 3.7");
			
		}else if (score>=58.0 && score<62.0)
		{
			System.out.println("The grade is 3.5");
			
		}else if (score>=62.0 && score<66.0)
		{
			System.out.println("The grade is 3.3");
			
		}else if (score>=66.0 && score<70.0)
		{
			System.out.println("The grade is 3.0");
			
		}else if (score>=70.0 && score<74.0)
		{
			System.out.println("The grade is 2.7");
			
		}else if (score>=74.0 && score<76.0)
		{
			System.out.println("The grade is 2.5");
			
		}else if (score>=76.0 && score<80.0)
		{
			System.out.println("The grade is 2.3");
			
		}else if (score>=80.0 && score<84.0)
		{
			System.out.println("The grade is 2.0");
			
		}else if (score>=84.0 && score<88.0)
		{
			System.out.println("The grade is 1.7");
			
		}else if (score>=88.0 && score<92.0)
		{
			System.out.println("The grade is 1.5");
			
		}else if (score>=92.0 && score<96.0)
		{
			System.out.println("The grade is 1.3");
			
		}else if (score>=96.0 && score<+100.0)
		{
			System.out.println("The grade is 1.0");
			
		}
		
		
		scan.close();
		//todo: when executing the program you will be ask to write a score.
		//The program converts the score then into a grade and prints that grade (1.0, 1.3, 1.7, ...)
		//Note that the student passed when the student gets a score of 50.0 points (4.0)
		
	}//end main
}//end class
