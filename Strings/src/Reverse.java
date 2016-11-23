import java.util.Scanner;

//intermediate

public class Reverse {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a string");
		String s = scan.nextLine();
		int size = s.length();
		String temp, temp2;
		int j;
		
		for (int i=0;i<size;i++)
		{
			j=size-i;
			temp[i]= s[j];
			temp2 = temp2 + s[j];
		}//end for
		
		//todo: take an String as input and reverse it. Then print it.
		
	}

}
