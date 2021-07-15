package src.srccode.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import src.srccode.clculator.CircleAreaCalculator;

class CircleAreaCalculatorTest {
	CircleAreaCalculator tester = new CircleAreaCalculator();
	Scanner mock = Mockito.mock(Scanner.class);

	@Test
	void testGetArea() {
		when(mock.nextInt()).thenReturn(5);
		assertEquals(78.53981633974483, tester.getArea(mock));
	}

	@Test
	void testGetPerimeter() {
		when(mock.nextInt()).thenReturn(5);
		assertEquals(157.07963267948966, tester.getPerimeter(mock));
	}

}
