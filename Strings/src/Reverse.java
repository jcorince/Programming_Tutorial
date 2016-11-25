import java.util.Scanner;

//intermediate

public class Reverse {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a string");
		String s = scan.nextLine();
		int size = s.length();
		String revS="";
		
		char[] aTemp = new char[size];
		
		for (int i=0;i<size;i++)
		{
			aTemp[i]=s.charAt(size-i-1);
		}//end for
		revS = String.copyValueOf(aTemp);
		System.out.println("The reverse of "+s+ " is: "+ revS);
		
		//todo: take an String as input and reverse it. Then print it.
	scan.close();	
	}

}
