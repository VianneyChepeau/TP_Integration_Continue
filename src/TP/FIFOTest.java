package TP;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FIFOTest {
	
	protected FIFO fifo;

	@BeforeEach
	void setUp() throws Exception {
		fifo = new FIFO(); 
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() {
		fifo.add(1);
		assertEquals(1, this.fifo.size());
		this.fifo.add(2);
		int expected = 2;
		assertEquals(expected, this.fifo.size());
	}

	@Test
	void testFirst() {
		assertThrows(NoSuchElementException.class,()->{this.fifo.first();});
		fifo.add(1);
		Integer expected = 1;
		assertEquals(expected, this.fifo.first());
	}

	@Test
	void testIsEmpty() {
		fifo.add(1);
		assertEquals(false, this.fifo.isEmpty());
	}

	@Test
	void testRemoveFirst() {
		assertThrows(NoSuchElementException.class,()->{this.fifo.removeFirst();});
		fifo.add(1);
		assertEquals(1, this.fifo.size());
		this.fifo.removeFirst();
		assertEquals(0, this.fifo.size());
	}

	@Test
	void testSize() {
		fifo.add(1);
		assertEquals(1, this.fifo.size());
	}

}
