package integration;

import org.testng.annotations.Test;

public class CalculatorTest {
	
	
	@Test
	public void testSum(){
		
		Calculator cal = new Calculator();
		
		cal.add(3, 5);
	}
	
	@Test
	public void testSubtract(){
		
		Calculator cal = new Calculator();
		
		cal.add(3, 5);
	}

}
