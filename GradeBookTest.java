import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook g1 = new GradeBook(5);
	GradeBook g2 = new GradeBook(5);
	@BeforeEach
	void setUp() throws Exception {
		g1.addScore(90.0);
		g1.addScore(78.5);
		g1.addScore(84.3);
		g2.addScore(95.5);
		g2.addScore(87.6);
		g2.addScore(62.8);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		
		assertEquals("90.0 78.5 84.3 0.0 0.0 ",g1.toString());
	}

	@Test
	void testSum() {
		assertEquals(252.8,g1.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(78.5,g1.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(84.3+90.0,g1.finalScore());
	}

}
