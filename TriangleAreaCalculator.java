package src.srccode.clculator;

import java.util.Scanner;

public class TriangleAreaCalculator extends RectangleAreaCalculator {

	@Override
	public String getArea(Scanner scanner) {
		System.out.println("Please enter the base of the triangle: ");
		int triangleBase = scanner.nextInt();
		System.out.println("Please enter the height of the triangle: ");
		int triangleHeight = scanner.nextInt();

		return Double.toString(((0.5 * triangleBase) * triangleHeight));
	}

	public String getAreaRightTriangle(Scanner scanner) {
		System.out.println("Please enter the first side of the right triangle: ");
		int firstSide = scanner.nextInt();
		System.out.println("Please enete the second side of the right triangle: ");
		int secondSide = scanner.nextInt();

		return Double.toString((0.5 * (firstSide * secondSide)));
	}

}
