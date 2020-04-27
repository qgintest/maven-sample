package techniques.tdd;

import org.junit.Assert;
import org.junit.Test;

import mavensample.Calculator;

public class CalculatorTests {
	
	Calculator cal = new Calculator();
	
	@Test
	public void addTwoNumbersTest() {
		Assert.assertEquals(2, cal.addTwoNumbers(1,1));
	}
	
	@Test
	public void subtractTwoNumbersTest() {
		Assert.assertEquals(0, cal.subtractTwoNumbers(1,1));
	}
	
	@Test
	public void divideTwoNumbersTest() {
		Assert.assertEquals(1, cal.divideTwoNumbers(1,1));
	}

}
