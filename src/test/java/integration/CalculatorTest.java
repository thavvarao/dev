package integration;

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

}
