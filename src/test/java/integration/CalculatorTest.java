package integration;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
	
	
	@Test
	public void testSum(){
		
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(5, 3));
	}
	
	@Test
	public void testSubtract(){
		
		Calculator cal = new Calculator();
		
		System.out.println(cal.substract(5, 3));
	}
	
	@Test
	public void multiply(){
		
		Calculator cal = new Calculator();
		
		Assert.assertTrue(15==cal.multiply(5, 3),"Expected 15 but result is: " + cal.multiply(5, 3));
	}


}
