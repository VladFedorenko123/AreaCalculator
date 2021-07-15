package src.srccode.clculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RectangleAreaCalculator implements Figure, Perimeter {
	private int length;
	private int width;
	private boolean restart = true;

	@Override
	public double getArea(Scanner scanner) {
		while (restart) {
			try {
				System.out.println("Please enter the length of the rectangle: ");
				length = scanner.nextInt();
				System.out.println("Please enter the width of the rectangle: ");
				width = scanner.nextInt();
				restart = false;
			} catch (InputMismatchException e) {
				System.out.println("Error: You entered the wrong number. Please enter number againg.\n");
				scanner.next();
			}
		}
		return length * width;
	}

	@Override
	public double getPerimeter(Scanner scanner) {
		while (restart) {
			try {
				System.out.println("Please enter the length of the rectangle: ");
				length = scanner.nextInt();
				System.out.println("Please enter the width of the rectangle: ");
				width = scanner.nextInt();
				restart = false;
			} catch (InputMismatchException e) {
				System.out.println("Error: You entered the wrong number. Please enter number againg.\n");
				scanner.next();
			}
		}

		return 2 * (length + width);
	}
}
