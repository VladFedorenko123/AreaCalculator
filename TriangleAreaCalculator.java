package src.srccode.clculator;

import java.util.Scanner;

public class TriangleAreaCalculator extends AbstractRectangleAreaCalculator {

	@Override
	public void triangle(Scanner scanner) {
		System.out.println("Please enter the base of the triangle: ");
		int triangleBase = scanner.nextInt();
		System.out.println("Please enter the height of the triangle: ");
		int triangleHeight = scanner.nextInt();
		scanner.close();

		System.out.println((0.5 * triangleBase) * triangleHeight);
	}

	@Override
	public void square(Scanner scanner) {
	}

	@Override
	public void circle(Scanner scanner) {
	}

	@Override
	public void rightTriangle(Scanner scanner) {
		System.out.println("Please enter the first side of the triangle: ");
		int firstSide = scanner.nextInt();
		System.out.println("Please enete the second side of the triangle: ");
		int secondSide = scanner.nextInt();
		scanner.close();

		System.out.println(0.5 * (firstSide * secondSide));
	}

}
