package FizzBuzz;

public class FizzBuzz {
	
	public String numberReturned(Integer number) {
		String output = "";
		boolean multipleOfSeven = number % 7 == 0;
		boolean multipleOfFive = number % 5 == 0;
		boolean multipleOfThree = number % 3 == 0;
		
		if (multipleOfThree && multipleOfFive && multipleOfSeven) {
			output = "Fizz Buzz Pop";
		} else if (multipleOfFive && multipleOfSeven) {
			output = "Buzz Pop";
		} else if (multipleOfThree && multipleOfSeven) {
			output = "Fizz Pop";
		} else if (multipleOfThree && multipleOfFive) {
			output = "Fizz Buzz";
		} else if (multipleOfSeven) {
			output = "Pop";
		} else if (multipleOfFive) {
			output = "Buzz";
		} else if (multipleOfThree) {
			output = "Fizz";
		} else {
			output = number.toString();
		}
		return output;
	}
	
}
