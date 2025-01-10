package math;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import static math.Calculation.*;

class CalculationTest {
	
	@Test
	@Disabled
	public void testFindMax() {
		assertEquals(4,findMax(new int[] {1,3,4,2}));
		assertEquals(-1,findMax(new int[] {-12,-1,-3,-4,-2}));
	}
	
	@Test
	public void testPositiveIntegers() {
		assertEquals(4,findMaxNew(new int[] {1,3,4,2}));
	}
	
	@Test
	public void testNegativeIntegers() {
		assertEquals(-1,findMaxNew(new int[] {-12,-1,-3,-4,-2}));
	}
	
	@Test
	public void testIntegers() {
		assertEquals(3,findMaxNew(new int[] {1,3,-4,-2,0}));
	}

}