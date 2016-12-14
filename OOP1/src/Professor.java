import java.util.ArrayList;


public class Professor 
{
	private String name;
	private String chair;
	private ArrayList lectures = new ArrayList();
	
	public Professor(String pN, String ch)
	{
		this.name = pN;
		this.chair = ch;
		
	}//end constructor
	
//==================================== setters and getters ==============================================	
	public String getName()
	{
		//String n;
		boolean isOK = false;
		boolean wrongChar = false;
		do
		{		
			System.out.println("Enter a name: ");			
			name = scan.nextLine();
			
			int nLength = name.length();
			int i = 0;
			
			if(wrongChar) //reset boolean and counter
			{
				wrongChar = false;
				i=0;
			}
			
			while(i<nLength)
			{
				
				char test = name.charAt(i);
				if(!Character.isLetter(test))
				{
						wrongChar = true;
						System.out.println("Name should only be made of letters.");
						i++;
				}//end if
				
				if (i == nLength-1)//if no non alphabetic character found
				{
					if(!wrongChar)
					{
						isOK = true;
					}//end if
				}//end if
				
				i++;
			}//end while
			
		}while(!isOK);
		
		return (name);
	}//end getName method
	
	
	public double getCredits()
	{
		//double cr;	
		do
		{
			System.out.println("Enter credits: ");
			
			while(!scan.hasNextDouble())
			{
				scan.next();
				System.out.println("Credit should be a number.");
				
			}//end while
			
			credits = scan.nextDouble();
			
			if(credits<0)
			{
				System.out.println("Credit should be a positive number.");
			}//end if
		}while(credits<0);
		
		
		return (credits);
	}//end getCredit method
//=======================================================================================================	
	//todo: write a constructor that already gives the student a name and a chair
	
	//todo: write getter and setter methods
	
	public void addLecture(String lecture)
	{
		
		
		
		//todo: fill this method
	}//end addLecture method
}//end professor class

