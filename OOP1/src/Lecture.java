import java.util.*;

public class Lecture 
{
	private String name;
	private double credits;
	
	Scanner scan = new Scanner(System.in);
	
	public Lecture(String n, double c)
	{
		this.name = n;
		this.credits = c;
	}//end constructor
	
	
	public void setData(String na, double cr)
	{
		name = na;
		credits = cr;
	}//end setter method
	
	public String getName()
	{
		//String n;
		System.out.println("Enter a name: ");
		
		name=scan.nextLine();
		
		return (name);
	}//end getName method
	
	
	public double getCredits()
	{
		//double cr;
		System.out.println("Enter credits: ");
		
		do
		{
			while(!scan.hasNextDouble())
			{
				scan.next();
				System.out.println("The credit should be a number");
				
			}//end while
			
			credits=scan.nextDouble();
			
			if(credits<0)
			{
				System.out.println("Credit should be a positive number.");
			}//end if
		}while(credits<0);
		
		
		return (credits);
	}//end getCredit method
	
	
	
	//todo: write a constructor which already takes a name and credits
	
	//todo: write getter and setter methods
//scan.close();
}