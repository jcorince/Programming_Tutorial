import java.util.Scanner;

public class Circle {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("Please enter the radius of your circle in cm");
		
		double radius;
		int count=0;
		int choice=0;
		
		do
		{
			//making sure the user enters a double
			while(!scan.hasNextDouble()) 
			{
			    scan.next();
			    System.out.println("Please enter a valid radius measure");
			}
			
			radius=scan.nextDouble();
			
			if(radius<0)
			{
				System.out.println("Please enter a value greater than 0.0");
			}//end if
		}while(radius<0); // end do-while		
		
		do
		{
			System.out.println("Please enter one of the below options");
			System.out.println("    1 to calculate the diameter of the circle with "+radius+" cm radius");
			System.out.println("    2 to calculate the circumference of the circle with "+radius+" cm radius");
			System.out.println("    3 to calculate the area of the circle with "+radius+" cm radius");
			
			while(!scan.hasNextInt()) 
			{
			    scan.next();
			    System.out.println("Please enter an integer as required.");
			}
			
			choice=scan.nextInt();
			
			
			if((choice ==1) || (choice ==2) || (choice ==3))
			{
				count=0;
				
			}else
			{
				count+=1;				
				System.out.println("Wrong value.");
				System.out.println("Please make sure you enter one of the required values.\n\n");
			}
			//end if			
			
		}while(count!=0);// end do-while

		if (choice == 1)
		{
			System.out.println("The diameter is "+diameter(radius)+" cm.");
			
		}else if (choice == 2)
		{
			System.out.println("The circumference is "+circumference(radius,Math.PI)+".");
		}else if (choice == 3)
		{
			System.out.println("The area is "+area(radius,Math.PI)+" square cm.");
		}//end if	
		
		scan.close();
	}// end main method
	
	public static double diameter(double r)
	{
		return (r*2);
	}//end diameter method
	
	public static double circumference(double r, double p)
	{
		return (diameter(r)*p);
	}//end circumference method
	
	public static double area(double r, double p)
	{
		return (r*r*p);
	}//end area method
	
	//todo: add some methods to compute a circle's diameter, circumference and area.
	//print some outputs to confirm you methods are working right.
}
