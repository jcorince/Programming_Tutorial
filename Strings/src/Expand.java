import java.util.Scanner;

//advanced

public class Expand {
	
	public static void printStr(String s, int n)
	{
		if(n==1)
		{
			System.out.print(s);
		}else if(n>1)
		{
			for(int i=1; i<=n; i++)
			{
				System.out.print(s);
				
			}//end for loop
		}
	}// end print method
	
	
	public static void alphaNumComp(String s)
	{
		/* ==================================   IMPORTANT REMINDER   =================================
		 * The line right below breaks the entered string and saves it into an array, separating     * 
		 * blocks of adjacent text from adjacent digits.                                             *
		 * \\D picks all non digit characters while \\d picks all digit characters.                  *
		   ==========================================================================================*/ 	
		
		String regex = ("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

        String[] str = s.split(regex);//split string into chunks of digits and letters only and save each in the array
        
        int num = 0;
        boolean prevWasNum = false;
        
        for(int j = 0; j<str.length;j++)
        {       	
        	String a = str[j];        	
        	
        	if (Character.isDigit(a.charAt(0))) //if the first character of the substring is a digit
        	{
        		num = Integer.parseInt(a);//parse string to get an integer
        		prevWasNum = true;//set boolean to true
        	}else if(Character.isLetter(a.charAt(0)))//if the first character of the substring is a letter
        	{
        		String b = str[j];
        		if(prevWasNum)//if boolean true
        		{
        			if(b.length()>1)//if multi-character substring
        			{
        				String c = Character.toString(b.charAt(0)); //extracting the first character of the substring       			
        				printStr(c, num); //print extracted character
        				printStr(b.substring(1), 1);//print the rest of the substring except the first character
        				
        			}else if (b.length() == 1)//if substring is single character
        			{
        				if(num>1)//if the number before substring is greater than one
        				{
        					printStr(b, num);
        				}else if (num == 1)//if the number before substring is one
        				{
        					printStr(b, 1);
        				}//end if - else
        				
        			}//end if - else        			
        			
        		}else// if boolean is false (e.g. the first character of the entered string is a letter)
        		{
        			printStr(b, 1);
        		}//end if
        	}//end if        	
        	
        }//end for loop
	}//end alphaNumComp method

	
	
//################################       MAIN METHOD BELOW       ###############################	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		int i=0;
		boolean hasWrongChar = false;
		boolean continueP = false;
		
		do
		{
			System.out.print("Enter an alphanumeric combination: ");
		
			String comb = scan.nextLine();
			int cLength = comb.length();
			
			if(hasWrongChar) //reset boolean and counter
			{
				hasWrongChar = false;
				i=0;
			}
			
			while(i<cLength)
			{
				
				char test = comb.charAt(i);
				if(!Character.isLetterOrDigit(test))
				{
						hasWrongChar = true;
						System.out.println("The combination should only be made of letters and numbers.");
						i++;
				}//end if
				
				if (i == cLength-1)//if no non alphanumeric character found
				{
					if(!hasWrongChar)
					{
						continueP = true;
					}//end if
				}//end if
				
				i++;
			}//end while
			
			if(continueP)
			{
				alphaNumComp(comb);
			}//end if
		}while(!continueP);//end do - while		

		scan.close();
		
		
		//todo: take as an input a combination of characters and numbers (e.g. 2a3b5c)
		//expand the String by printing each letter so many times as the number before 
		//the letter indicates e.g. 2a3b5c -> aabbbccccc
		//Hint: first start with inputs where there is always a number and then a character, 
		//then think about how to improve your code such that you can use values greater or equal 10, 
		//eg. 10a13b22c 
		//Further modification: if a character should only be printed one time you don't need 
		//to write any number in front of that character e.g. a3b12cd5e -> abbbccccccccccccdeeeee  
		
	}//end main method
	
}//end class
