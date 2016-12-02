
public class ExceptionHandling {

	
	public static void main(String[] args) {
		
		//todo:
		//1.) Execute the following program. It will throw Exceptions.
		//Catch the Exceptions using their proper Names till no further
		//exceptions occur.
		//
		//2.) Taking the square root of a negative number won't cause
		//the exception. Write your own Exception for this case and 
		//write a method which throws this exception

		int a = 5;
		int b = 0;
		int div = a/b;
		
		int[] arr = new int[5];
		arr[5] = 7;
		
		String one = "one";
		int i = Integer.parseInt(one);
		
		double c = -7.0;
		double d = Math.sqrt(c);
		System.out.println(d);
	}

}
