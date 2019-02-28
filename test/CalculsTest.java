package main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculsTest {

	protected Calculs calculs;
	protected int operande1 = 6;
	protected int operande2 = 2;
	
	// Method appelée au début
	@BeforeEach
	void setUp() throws Exception { 
		calculs = new Calculs(operande1, operande2);	
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMultiplier() {
		assertEquals(12, this.calculs.multiplier());
	}

	@Test
	void testAdditionner() {
		assertEquals(8, this.calculs.additionner());
	}

	@Test
	void testDiviser() {
		assertEquals(3, this.calculs.diviser());
	}

	@Test
	void testSoustraire() {
		assertEquals(4, this.calculs.soustraire());
	}

}
