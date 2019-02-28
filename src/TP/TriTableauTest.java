package TP;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriTableauTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTriCroissant() {
		int tableau[] = { 1,4,3,5,2 };
		TriTableau.triCroissant(tableau);
		assertEquals(1, tableau[0]);
		assertEquals(2, tableau[1]);
		assertEquals(3, tableau[2]);
		assertEquals(4, tableau[3]);
		assertEquals(5, tableau[4]);
	}

	@Test
	void testTriDecroissant() {
		int tableau[] = { 1,4,3,5,2 };
		TriTableau.triDecroissant(tableau);
		assertEquals(5, tableau[0]);
		assertEquals(4, tableau[1]);
		assertEquals(3, tableau[2]);
		assertEquals(2, tableau[3]);
		assertEquals(1, tableau[4]);
	}

}
