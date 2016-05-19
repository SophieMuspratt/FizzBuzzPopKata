package FizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	
	private FizzBuzz game = new FizzBuzz();

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
		assertEquals("Buzz", game.numberReturned(200));
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

}