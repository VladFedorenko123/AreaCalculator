package src.srccode.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import src.srccode.clculator.RectangleAreaCalculator;

class RectangleAreaCalculatorTest {
	RectangleAreaCalculator tester = new RectangleAreaCalculator();
	Scanner mock = Mockito.mock(Scanner.class);

	@Test
	void testGetArea() {
		when(mock.nextInt()).thenReturn(5);
		assertEquals(25, tester.getArea(mock));
	}

	@Test
	void testGetPerimeter() {
		when(mock.nextInt()).thenReturn(5);
		assertEquals(20, tester.getPerimeter(mock));
	}

}
