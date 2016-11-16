import java.util.*;
public class BasicsArrayList {
	
	public static void arrayListPush(ArrayList a, int i)
	{
		
		a.add(new Integer (i));
		System.out.println(i+" successfully added to the arrayList.");
	}//end arrayListPush method
	
	public static void arrayListPop(ArrayList a, int t)
	{
		Integer s = new Integer (t);
		if(a.contains(s))	{
			
			int i = a.indexOf(s);
			a.remove(i);
			System.out.println(t+" successfully removed from the arrayList.");
		}else
		{
			System.out.println("The arrayList does not contain "+t+".");
		}//end if
	}//end arrayListPop method
	
	public static void printArrayList(ArrayList a)
	{
		System.out.println(a);
	}//end printArrayList method
	
	
//#######################################       MAIN METHOD BELOW         ########################################
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n, v, target;
		//Integer v;
		
		System.out.println("How many numbers will you initially deal with?");
		do 
		{
			while(!scan.hasNextInt())
			{
				scan.next();
				System.out.println("You must enter an integer.");
			}//end while
			n = scan.nextInt();
			if(n<0)
			{
				System.out.println("Please enter a number greater than zero.");
			}//end if
		}while(n<0); //end do while
		
		ArrayList myArrayList = new ArrayList(n);
		
		System.out.println("Enter "+n+" numbers now:");
		
		for(int c=0;c<n;c++)
		{
			do 
			{
				while(!scan.hasNextInt())
				{
					scan.next();
					System.out.println("You must enter an integer.");
				}//end while
				//myArrayList.add(new Integer ());
				v = scan.nextInt();
				if(v<0)
				{
					System.out.println("Please enter a number greater than zero.");
				}//end if
			}while(v<0); //end do while    
			
			arrayListPush(myArrayList, v);
		}//end for loop
		
		System.out.println("Enter the number you woud like to delete:");
		
		do 
		{
			while(!scan.hasNextInt())
			{
				scan.next();
				System.out.println("You must enter an integer.");
			}//end while
			target = scan.nextInt();
			if(target<0)
			{
				System.out.println("Please enter a number greater than zero.");
			}//end if
		}while(target<0); //end do while
		
		arrayListPop(myArrayList, target);
		
		System.out.println("The array list now contains: ");
		printArrayList(myArrayList);
				
		scan.close();// closing scanner to free memory
	}//end main method
//beginner
	
	//todo: write some methods for basic operations with ArrayLists:
	//-write a method where you can add a certain value to an ArrayList
	//-write a method which prints all the values in an ArrayList

}
