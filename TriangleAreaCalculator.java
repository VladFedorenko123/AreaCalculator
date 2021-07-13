package src.srccode.clculator;

import java.util.Scanner;

public class TriangleAreaCalculator implements Figure {

	@Override
	public String getArea(Scanner scanner) {
		System.out.println("Please enter the base of the triangle: ");
		int triangleBase = scanner.nextInt();
		System.out.println("Please enter the height of the triangle: ");
		int triangleHeight = scanner.nextInt();

		return Double.toString(((0.5 * triangleBase) * triangleHeight));
	}

}
