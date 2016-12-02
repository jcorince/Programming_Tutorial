import java.util.Scanner;

//advanced

public class Expand {
	
	public static void printChar(char s, int n)
	{
		if(n==1)
		{
			System.out.print(s);
		}else if(n>1)
		{
			for(int i=1; i<=n; i++)
			{
				System.out.print(s);
				//System.out.print(i);
			}//end for loop
		}/*else
		{
			System.out.println("Your combination contains a non alphanumeric character.");
			System.exit(-1);
		}//end if else
*/		
		
	}// end print method
	
	
	public static void alphaNumComp()
	{
		
	}//end alphaNumComp method

	
	
//################################       MAIN METHOD BELOW       ###############################	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter an alphanumeric combination: ");
		
		String comb = scan.nextLine();
		int cLength = comb.length();
/*		
		//perform check on entered alphanumeric combination
		int i=0;
		//int test=0;
		while(i<cLength)
		{
			if (!Character.isLetter(comb.charAt(i))) //if a character is not a letter
			{
				//test=1;
				if(!Character.isDigit(comb.charAt(i))) //if a character is not a digit
				{
					//test = 2;
					System.out.println("Your combination contains non alphanumeric character(s).");
					System.exit(-1);
				}else//if character is a digit
				{
					i++;
					//test = 3;
				}//end if-else
				i++;								
			}else//if character is a letter
			{
				i++;
			}//end if
			if(i==(cLength-1)&& test ==1)
			{
				if (!Character.isLetter(comb.charAt(i))) //if no character is a letter
				{
					System.out.println("Your combination contains only numbers or non alphanumeric character(s).");
					System.exit(-1);
				}
			}
			i++;
		}//end while loop
		*/
//========================================================================================================		
		char c;
		int d, k;//, temp;
		int j=0;
	
		while(j<cLength)
		//for(int j=0;j<cLength;j++)
		{			
			if(Character.isDigit(comb.charAt(j)))  //first character is a digit
			{
				if(Character.isDigit(comb.charAt(j+1)))  //next character is a digit
				{
					k=j;
					while(!Character.isLetter(comb.charAt(k))&& k<cLength)
					{
						k++;
					}//end while loop
					
					d = 0;
					//temp =k;
					c = comb.charAt(k);
					
					int e = k-j;
					while(e>=0)
					{						
						d += (comb.charAt(j)- '0')* ((int)Math.pow(10, (e-1)));
						e--;
						j++;
						//e = k-j;
					}//end while
					//+(comb.charAt(j+1)- '0');
					j=k;
					printChar(c, d);					
				}else // next character is not a digit
				{
					if(Character.isLetter(comb.charAt(j)))//next character is a letter
					{
						d = comb.charAt(j)- '0';
						c = comb.charAt(j+1);
						if(comb.charAt(j) == 1) // first character is 1
						{
							d=1;
							printChar(c, d);
							j++;
						}else //first character greater than 1
						{
							printChar(c, d);
							j++;
						}//end if - else
					}/*else //next character is neither a number nor a letter
					{
						System.out.println("Your combination contains a non alphanumeric character.");
						System.exit(-1);
					}//end if-else
*/										
				}//end if
			}else if(j==0) //first character is no digit
			{
				if(Character.isLetter(comb.charAt(j)))//first character is a letter
				{
					if(Character.isLetter(comb.charAt(j+1)))//next character is a letter
					{
						
					}//end if
					c = comb.charAt(j);
					d =1;
					printChar(c, d);
					j++;
				}/*else //first character is neither a number nor a letter
				{
					System.out.println("The first digit must be either a positive integer or a letter.");
					System.exit(-1);
				}//end if-else	
*/				
			}else //if character is not the first
			{
				if(Character.isLetter(comb.charAt(j)))
				{
					if (Character.isLetter(comb.charAt(j+1)))
					{
						c = comb.charAt(j);
						d =1;
						printChar(c, d);
						j++;
					}
					j++;
				}
				j++;
			}//end if-else				
		j++;
		}//end while
		//todo: take as an input a combination of characters and numbers (e.g. 2a3b5c)
		//expand the String by printing each letter so many times as the number before 
		//the letter indicates
		//e.g. 2a3b5c -> aabbbccccc
		//Hint: first start with inputs where there is always a number and then a character, 
		//then think about how
		//to improve your code such that you can use values greater or equal 10, eg. 10a13b22c
		//Further modification: if a character should only be printed one time you don't need 
		//to write any number infront of that character
		//e.g. a3b12cd5e -> abbbccccccccccccdeeeee  
	scan.close();	
	}
	
}
