package src.srccode.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Scanner;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import src.srccode.clculator.RightTriangleAreaCalculator;

class RightTriangleAreaCalculatorTest {
	RightTriangleAreaCalculator tester = new RightTriangleAreaCalculator();
	Scanner mock = Mockito.mock(Scanner.class);

	@Test
	void testGetArea() {
		when(mock.nextInt()).thenReturn(5);
		assertEquals(12.5, tester.getArea(mock));
	}

	@Test
	void testGetPerimeter() {
		when(mock.nextInt()).thenReturn(6);
		assertEquals(18, tester.getPerimeter(mock));
	}

}
