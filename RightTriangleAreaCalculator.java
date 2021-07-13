package src.srccode.clculator;

import java.util.Scanner;

public class RightTriangleAreaCalculator implements Figure {
	@Override
	public String getArea(Scanner scanner) {
		System.out.println("Please enter the first side of the right triangle: ");
		int firstSide = scanner.nextInt();
		System.out.println("Please enete the second side of the right triangle: ");
		int secondSide = scanner.nextInt();

		return Double.toString((0.5 * (firstSide * secondSide)));
	}
}
