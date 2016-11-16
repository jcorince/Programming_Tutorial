import java.util.*;
public class BubbleSort {
//intermediate
	
	public static int[] bubbleSort(int[] a, int b)
	{
		int temp;
		if (b==1)//sort in ascending order
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<((a.length)-i-1);j++)
				{
					if(a[j]>a[j+1])
					{
						temp = a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}//end if
				}//end for
			}//end for
		}else if(b==2)//sort in descending order
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<((a.length)-i-1);j++)
				{
					if(a[j]<a[j+1])
					{
						temp = a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}//end if
				}//end for
			}//end for
				
			
		}//end if
		return(a);
	}// end bubbleSort method
	
//#########################################   MAIN METHOD BELOW    ############################################# 
	
	
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int size;
		int sort;
		
		System.out.println("How many numbers do you want to sort?");
		
		do
		{
			while(!scan.hasNextInt())
			{
				scan.next();
				System.out.println("The entered value should be an integer.");
			}//end while
			size = scan.nextInt();
			if(size<0)
			{
				System.out.println("The entered value must be greater than zero.");
			}//end if
		}while(size<0); //end do while
		
		
		
		int [] myArray = new int [size];
		
		System.out.println("Array of size "+size+" created.");
		
		System.out.println("Please enter the "+size+" integers to be sorted:");
		
		for(int i=0;i<size;i++)
		{
			do
			{
				while(!scan.hasNextInt())
				{
					scan.next();
					System.out.println("The entered value should be an integer.");
				}//end while
				myArray[i] = scan.nextInt();
				if(myArray[i]<0)
				{
					System.out.println("Please enter a positive value.");
				}//end if
			}while((myArray[i])<0); //end do while			
			
		}//end for
		
		System.out.println(size+" values sucessfully stored in the array.");
		System.out.println("Enter 1 for ascending sorting or 2 for descending sorting.");
		
		//getting user's sorting order wish
		do 
		{
			while(!scan.hasNextInt())
			{
				scan.next();
				System.out.println("You must enter 1 or 2.");
			}//end while
			sort = scan.nextInt();
			if(sort<0)
			{
				System.out.println("Please enter 1 or 2.");
			}//end if
		}while(sort<0); //end do while
		
		try 
		{
			Thread.sleep(2500);
		} catch(InterruptedException e) 
		{
		} 
		System.out.print("Calling the buble sort method");
		
		bubbleSort(myArray,sort);
		
		try 
		{
			Thread.sleep(1000);
		} catch(InterruptedException e) 
		{
		} 
		System.out.print(".");
		try 
		{
			Thread.sleep(1000);
		} catch(InterruptedException e) 
		{
		} 
		System.out.print(".");
		try 
		{
			Thread.sleep(1000);
		} catch(InterruptedException e) 
		{
		} 
		System.out.print(".");
		try 
		{
			Thread.sleep(1000);
		} catch(InterruptedException e) 
		{
		} 
		System.out.println(".");
		
		try 
		{
			Thread.sleep(1500);
		} catch(InterruptedException e) 
		{
		} 
		
		if (sort==1)
		{
			System.out.print("The numbers sorted in an ascending order are as follows {");
		}else if (sort==2)
		{
			System.out.print("The numbers sorted in a descending order are as follows {");
		}//end if		
		
		for (int j=0;j<size;j++)
		{
			System.out.print(myArray[j]);
			if(j==(size-1))
			{
				System.out.println("}");
			}else
			{
				System.out.print(", ");
			}//end if
		}//end for
		//System.out.println("\b\b}");
		
		scan.close();//closing the scanner
	}//end main method
	
	//todo: sort an array using bubblesort.
	//if you don't know how bubblesort works you can read it here: http://www.pkirs.utep.edu/CIS3355/Tutorials/chapter9/tutorial9A/bubblesort.htm
	
}
