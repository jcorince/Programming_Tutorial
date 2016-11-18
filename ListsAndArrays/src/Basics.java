import java.util.*;
public class Basics {
//beginner
	
	public static int arrayLength(int[] a)
	{
		return (a.length);
	}//end arrayLength method
	
	public static int[] dropLastElement(int[] a, int[] n)
	{
		for (int i=0; i<(arrayLength(a)-1); i++)
		{
			n[i]= a[i];
		}//end for
		return (n);
	}//end dropLastElement method
	
	public static int sumElement(int[] a)
	{
		int sum=0;
		for(int i=0;i<arrayLength(a); i++)
		{
			sum+=a[i];
		}//end for
		return(sum);
	}//end sumElement method
	
	public static void elementSearch(int[] a, int e)
	{
		int p=0;
		for (int j=0; j<arrayLength(a); j++)
		{
			if (a[j]== e)
			{
				p = 1;
				//u = j;
				System.out.println("The searched element "+e+" has been found in the array at the "+j+"th position." );
			}else if (p!=1){
				p=2;
				
			}
		}//end for
		if (p==2)
		{
			System.out.println("Sorry, the searched value could not be found in the array.");
		}//end if
	}//end elementSearch method
	
	
	
//###################################################################################################################
	
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] myArray = { 
			    1, 2, 3,
			    4, 5, 6, 
			    7, 8, 9, 10
			};
		
		int number =(arrayLength(myArray)-1);
		int[] myShortArray = new int[number];
		
		int value=0;
		
		System.out.print("Our initial array is as follows {");
		
		for (int i=0;i<arrayLength(myArray);i++)
		{
			System.out.print(myArray[i]);
			if(i==((arrayLength(myArray)-1)))
			{
				System.out.println("}");
			}else
			{
				System.out.print(", ");
			}//end if
		}//end for		
		
		System.out.println("The length of the array is "+arrayLength(myArray)+".");
		
		dropLastElement(myArray,myShortArray);
		System.out.print("Our array after dropping the last element looks as follows {");
		for (int i=0;i<arrayLength(myShortArray);i++)
		{
			System.out.print(myShortArray[i]);
			if(i==((arrayLength(myShortArray)-1)))
			{
				System.out.println("}");
			}else
			{
				System.out.print(", ");
			}//end if
		}//end for
		
		System.out.println("The sum of the elements of our initial array is "+sumElement(myArray)+".");
		
		System.out.println("Please enter the element to be searched in the array.");

		while (!scan.hasNextInt())
		{
			scan.next();
			System.out.println("The element must be an integer.");
			
		}//end while
		value = scan.nextInt();
		
		elementSearch(myArray,value);
		
		
		
		scan.close();//closing scanner;
	}//end main method
	
	
	//todo: write some methods for some basic operations with arrays, like:
	//-return the length of an array
	//-drop the last element of an array
	//-sum up all the elements of an integer array
	//-check if an array contains a given element

}
