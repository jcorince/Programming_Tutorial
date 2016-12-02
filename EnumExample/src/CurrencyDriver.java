
public class CurrencyDriver {

	//This is an example on how enums work with java.
	//You will see that enums are very similar to classes.
	//They are very usefull if you just want to allow certain inputs.
	//Try to understand this example and then go to EnumExercise.
	public static void main(String[] args) {
		
		for(Currency coin: Currency.values()){
			System.out.println("coin: " + coin + " " + coin.getValue());
		}
	}

}
