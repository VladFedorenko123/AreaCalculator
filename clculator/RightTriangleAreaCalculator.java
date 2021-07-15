package src.srccode.clculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RightTriangleAreaCalculator implements Figure {
	private int firstSide;
	private int secondSide;
	private int hypotenuse;
	private boolean restart = true;
	@Override
	public double getArea(Scanner scanner) {
		while (restart) {
			try {
				System.out.println("Please enter the first side of the right triangle: ");
				firstSide = scanner.nextInt();
				System.out.println("Please enete the second side of the right triangle: ");
				secondSide = scanner.nextInt();
				restart = false;
			} catch (InputMismatchException e) {
				System.out.println("Error: You entered the wrong number. Please enter number againg.\n");
				scanner.next();
			}
		}
		return 0.5 * (firstSide * secondSide);
	}

	@Override
	public double getPerimeter(Scanner scanner) {
		while (restart) {
			try {
				System.out.println("Please enter the firs side of the right triangle: ");
				firstSide = scanner.nextInt();
				System.out.println("Please enter the second side of the right triangle: ");
				secondSide = scanner.nextInt();
				System.out.println("Please enter the hypotenuse of the right triangle: ");
				hypotenuse = scanner.nextInt();
				restart = false;
			} catch (InputMismatchException e) {
				System.out.println("Error: You entered the wrong number. Please enter number againg.\n");
				scanner.next();
			}
		}
		return firstSide + secondSide + hypotenuse;

	}
}
