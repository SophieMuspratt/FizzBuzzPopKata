package FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	private List<Rule> rules;

	public FizzBuzz() {
		rules = new ArrayList<>();
		// Set up rules for Feature 1-2
		rules.add(new FizzRule());
		rules.add(new BuzzRule());
		rules.add(new PopRule());

		// //Add new rules for Feature 3
		rules.add(new Rule(8, "Bang "));
	}

	public FizzBuzz(List<Rule> rules) {
		this.rules = rules;
	}

	public String numberReturned(Integer number) {
		String output = "";

		for (Rule rule : rules) {
			output += rule.check(number);
		}

		if (output.equals("")) {
			output += number.toString();
		}

		return output.trim();
	}

	public static class Rule {

		private int divisor;
		private String replacement;

		public Rule(int divisor, String replacement) {
			this.divisor = divisor;
			this.replacement = replacement;
		}

		public String check(int number) {
			if (number % divisor == 0)
				return replacement;
			return "";
		}
	}

	public static class FizzRule extends Rule {
		public FizzRule() {
			super(3, "Fizz ");
		}

	}

	public static class BuzzRule extends Rule {
		public BuzzRule() {
			super(5, "Buzz ");
		}

	}

	public static class PopRule extends Rule {
		public PopRule() {
			super(7, "Pop ");
		}

	}
}
