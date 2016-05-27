package FizzBuzz;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import FizzBuzz.FizzBuzz.Rule;
import FizzBuzz.FizzBuzz.FizzRule;
import FizzBuzz.FizzBuzz.BuzzRule;
import FizzBuzz.FizzBuzz.PopRule;

public class FizzBuzzTest {
	
	private List<Rule> rules = Arrays.asList(new FizzRule(), new BuzzRule(), new PopRule(), new Rule(8, "Bang "));
	private FizzBuzz game = new FizzBuzz(rules);

	// Testing for Feature 1-2
	@Test
	public void normalNumberReturnsSameNumber1() {
		assertEquals("1", game.numberReturned(1));
		assertEquals("2", game.numberReturned(2));
		assertEquals("4", game.numberReturned(4));
	}
		
	@Test
	public void multiplesOfThreeReturnFizz() {
		assertEquals("Fizz", game.numberReturned(3));
		assertEquals("Fizz", game.numberReturned(9));
		assertEquals("Fizz", game.numberReturned(123));
	}
		
	@Test
	public void multiplesOfFiveReturnBuzz() {
		assertEquals("Buzz", game.numberReturned(5));
		assertEquals("Buzz", game.numberReturned(20));
		assertEquals("Buzz", game.numberReturned(205));
	}
	
	@Test
	public void multiplesOfThreeAndFiveReturnFizzBuzz() {
		assertEquals("Fizz Buzz", game.numberReturned(15));
		assertEquals("Fizz Buzz", game.numberReturned(45));
		assertEquals("Fizz Buzz", game.numberReturned(345));
	}
	
	@Test
	public void multiplesOfSevenReturnPop() {
		assertEquals("Pop", game.numberReturned(7));
		assertEquals("Pop", game.numberReturned(28));
		assertEquals("Pop", game.numberReturned(77));
	}
	
	@Test
	public void multiplesOfThreeAndSevenReturnFizzPop() {
		assertEquals("Fizz Pop", game.numberReturned(21));
		assertEquals("Fizz Pop", game.numberReturned(63));
		assertEquals("Fizz Pop", game.numberReturned(126));
	}
	
	@Test
	public void multiplesOfFiveAndSevenReturnBuzzPop() {
		assertEquals("Buzz Pop", game.numberReturned(35));
		assertEquals("Buzz Pop", game.numberReturned(70));
		assertEquals("Buzz Pop", game.numberReturned(140));
	}
	
	@Test
	public void multiplesOfThreeAndFiveAndSevenReturnFizzBuzzPop() {
		assertEquals("Fizz Buzz Pop", game.numberReturned(105));
		assertEquals("Fizz Buzz Pop", game.numberReturned(210));
		assertEquals("Fizz Buzz Pop", game.numberReturned(315));
	}
	
	//New Variation Tests for Feature 3
	
	@Test
	public void multiplesOfEightReturnBang() {
		assertEquals("Bang", game.numberReturned(8));
		assertEquals("Bang", game.numberReturned(88));
		assertEquals("Bang", game.numberReturned(152));
	}
	
	@Test
	public void multiplesOfThreeAndEightReturnFizzBang() {
		assertEquals("Fizz Bang", game.numberReturned(24));
		assertEquals("Fizz Bang", game.numberReturned(48));
		assertEquals("Fizz Bang", game.numberReturned(96));
	}
	
	@Test
	public void multiplesOfFiveAndEightReturnBuzzBang() {
		assertEquals("Buzz Bang", game.numberReturned(40));
		assertEquals("Buzz Bang", game.numberReturned(80));
		assertEquals("Buzz Bang", game.numberReturned(160));
	}
	
	@Test
	public void multiplesOfSevenAndEightReturnPopBang() {
		assertEquals("Pop Bang", game.numberReturned(56));
		assertEquals("Pop Bang", game.numberReturned(112));
		assertEquals("Pop Bang", game.numberReturned(392));
	}
	
	@Test
	public void multiplesOfThreeAndFiveAndEightReturnFizzBuzzBang() {
		assertEquals("Fizz Buzz Bang", game.numberReturned(120));
		assertEquals("Fizz Buzz Bang", game.numberReturned(240));
		assertEquals("Fizz Buzz Bang", game.numberReturned(360));
	}
	
	@Test
	public void multiplesOfThreeAndSevenAndEightReturnFizzPopBang() {
		assertEquals("Fizz Pop Bang", game.numberReturned(168));
		assertEquals("Fizz Pop Bang", game.numberReturned(336));
		assertEquals("Fizz Pop Bang", game.numberReturned(672));
	}
	
	@Test
	public void multiplesOfFiveAndSevenAndEightReturnBuzzPopBang() {
		assertEquals("Buzz Pop Bang", game.numberReturned(280));
		assertEquals("Buzz Pop Bang", game.numberReturned(560));
		assertEquals("Buzz Pop Bang", game.numberReturned(1120));
	}
	
	@Test
	public void multiplesOfThreeAndFiveAndSevenAndEightReturnFizzBuzzPopBang() {
		assertEquals("Fizz Buzz Pop Bang", game.numberReturned(840));
		assertEquals("Fizz Buzz Pop Bang", game.numberReturned(1680));
		assertEquals("Fizz Buzz Pop Bang", game.numberReturned(3360));
	}

}