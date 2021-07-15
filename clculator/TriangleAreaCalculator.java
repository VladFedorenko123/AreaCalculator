package src.srccode.clculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleAreaCalculator implements Figure {
	private int triangleBase;
	private int triangleHeight;
	private int leftSide;
	private int rightSide;
	private boolean restart = true;

	@Override
	public double getArea(Scanner scanner) {
		while (restart) {
			try {
				System.out.println("Please enter the base of the triangle: ");
				triangleBase = scanner.nextInt();
				System.out.println("Please enter the height of the triangle: ");
				triangleHeight = scanner.nextInt();
				restart = false;
			} catch (InputMismatchException e) {
				System.out.println("Error: You entered the wrong number. Please enter number againg.\n");
				scanner.next();
			}

		}
		return (0.5 * triangleBase) * triangleHeight;
	}

	@Override
	public double getPerimeter(Scanner scanner) {
		while (restart) {
			try {
				System.out.println("Please enter the first side of the triangle: ");
				triangleBase = scanner.nextInt();
				System.out.println("Please enter the left side of the triangle: ");
				leftSide = scanner.nextInt();
				System.out.println("Please enter the rifht side of the triangle: ");
				rightSide = scanner.nextInt();
				restart = false;
			} catch (InputMismatchException e) {
				System.out.println("Error: You entered the wrong number. Please enter number againg.\n");
				scanner.next();
			}
		}
		return rightSide + leftSide + triangleBase;
	}

}
