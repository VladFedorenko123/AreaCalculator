package src.srccode.clculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleAreaCalculator implements Figure, Perimeter {
	private int radius;
	private boolean restart = true;

	@Override
	public double getArea(Scanner scanner) {
		while (restart) {
			try {
				System.out.println("Please enter the radius of the circle: ");
				radius = scanner.nextInt();
				restart = false;
			} catch (InputMismatchException e) {
				System.out.println("Error: You entered the wrong number. Please enter number againg.\n");
				scanner.next();
			}
		}

		return Math.PI * (radius * radius);
	}

	@Override
	public double getPerimeter(Scanner scanner) {
		while (restart) {
			try {
				System.out.println("Please enter the radius of the circle: ");
				radius = scanner.nextInt();
				restart = false;
			} catch (InputMismatchException e) {
				System.out.println("Error: You entered the wrong number. Please enter number againg.\n");
				scanner.next();
			}
		}
		return 2 * Math.PI * (radius * radius);
	}
}
