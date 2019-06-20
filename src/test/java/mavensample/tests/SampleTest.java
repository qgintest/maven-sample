package mavensample.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
	
	
	@Test
	public void FirstTest() {
		Assert.fail();
		//System.out.println("Testing Maven 1");
	}
	
	@Test
	public void SecondTest() {
		System.out.println("Testing Maven 2");
	}

}
