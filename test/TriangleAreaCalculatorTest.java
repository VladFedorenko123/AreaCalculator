package src.srccode.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import src.srccode.clculator.TriangleAreaCalculator;

class TriangleAreaCalculatorTest {
	TriangleAreaCalculator objectUnderTest = new TriangleAreaCalculator();
	Scanner mock = Mockito.mock(Scanner.class);

	@Test
	void testGetArea() {
		when(mock.nextInt()).thenReturn(5);
		assertEquals(12.5, objectUnderTest.getArea(mock), "The optional failure message is now the last parameter");

	}

	@Test
	void testGetPerimeter() {
		when(mock.nextInt()).thenReturn(5);
		assertEquals(15, objectUnderTest.getPerimeter(mock));
	}

}
